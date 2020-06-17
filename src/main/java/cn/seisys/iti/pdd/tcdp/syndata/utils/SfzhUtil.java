package cn.seisys.iti.pdd.tcdp.syndata.utils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 身份证15位转18位
 */
public class SfzhUtil {
    static final int[] coefficient = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
    static final String[] mantissa = {"1","0","X","9","8","7","6","5","4","3","2"};
    static final String reg = "\\d{17}X|\\d{18}|\\d{15}";
    static final Pattern pattern = Pattern.compile(reg);

    /**
     *  身份证转码处理
     * @param old 旧身份证数据
     * @return 新身份证
     */
    public static String sfzhTransfer(String old) {
        if (StringUtils.isBlank(old)) {
            return "";
        }
        Matcher matcher = pattern.matcher(old);
        if (matcher.find()) {
            if (15 == old.length()) {
                String newSfzh;
                StringBuilder builder = new StringBuilder(old);
                builder.insert(6, "19");
                String tmp = builder.toString();
                int total = 0;
                for (int i = 0; i < tmp.length(); i++) {
                    String c = tmp.substring(i, i+1);
                    total += Integer.parseInt(c) * coefficient[i];
                }
                builder.append(mantissa[total % 11]);
                newSfzh = builder.toString();
                return newSfzh;
            }if (18 == old.length()) {
                return old;
            } else {
                //尝试从脏数据中取出身份证数据
                return sfzhTransfer(matcher.toMatchResult().group());
            }
        } else {
            return old;
        }
    }
    
    public static void main(String[] args) {
    	SfzhUtil.sfzhTransfer("32108719800811223x");
    	System.out.println(SfzhUtil.sfzhTransfer("32108719800811223x"));
    }
}
