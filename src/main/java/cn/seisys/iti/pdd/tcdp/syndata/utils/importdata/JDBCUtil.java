package cn.seisys.iti.pdd.tcdp.syndata.utils.importdata;

import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;
import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


public class JDBCUtil {
    //    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    //数据库连接对象
    private static Connection conn = null;

    private static String driver = "oracle.jdbc.driver.OracleDriver"; //驱动

    private static String url = ""; //连接字符串

    private static String username = ""; //用户名

    private static String password = ""; //密码

    public JDBCUtil(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // 获得连接对象
    public static synchronized Connection getConn(boolean changeFlag) {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }


    public void addBatchForDeclare(PreparedStatement pds, Declare206Entity entity, int index) {
        try {
            pds.setString(1, entity.getId());
            //申请人,申报企业名称
            pds.setString(2, entity.getMaker());
            //申请时间
            pds.setDate(3, StringUtils.isNotEmpty(entity.getMake_date()) ? new java.sql.Date(sdf.parse(entity.getMake_date()).getTime()) : null);
            //项目名称
            pds.setString(4, entity.getMake_project());
            //联系人：企业紧急联系人
            pds.setString(5, entity.getConnects());
            //联系人电话：企业紧急联系人电话
            pds.setString(6, entity.getConnect_no());
            //事项说明
            pds.setString(7, entity.getExplanations());
            //申报单号
            pds.setString(8, entity.getDeclare_code());
            //新申报单号
            pds.setString(9, entity.getNew_declare_code());
            //港口作业单位：散装时为申报单位，包装时页面下拉选择
            pds.setString(10, entity.getUnit_code());
            //作业委托人：申报企业名称
            pds.setString(11, entity.getConsigner());
            //船名
            pds.setString(12, entity.getShip_name());
            //航次
            pds.setString(13, entity.getVoyage_number_code());
            //作业地点
            pds.setString(14, entity.getAddress());
            //起运港
            pds.setString(15, entity.getFrom_port_code());
            //目的港
            pds.setString(16, entity.getTo_port_code());
            //开工时间
            pds.setDate(17, StringUtils.isNotEmpty(entity.getPre_start_date()) ? new java.sql.Date(sdf.parse(entity.getPre_start_date()).getTime()) : null);
            //完工时间
            pds.setDate(18, StringUtils.isNotEmpty(entity.getPre_end_date()) ? new java.sql.Date(sdf.parse(entity.getPre_end_date()).getTime()) : null);
            //包装件
            pds.setString(19, entity.getPack_code());
            //集装箱号（仅出口包装使用）
            pds.setString(20, entity.getMerge_container_code());
            //港口作业方式
            pds.setString(21, entity.getHandle_mode());
            // 附交的相关证件
            pds.setString(22, entity.getAdd_info());
            //安全防范措施;
            pds.setString(23, entity.getEmergency_code());
            //申报单位
            pds.setString(24, entity.getDeclare_unit());
            //申报日期
            pds.setDate(25, StringUtils.isNotEmpty(entity.getDeclare_date()) ? new java.sql.Date(sdf.parse(entity.getDeclare_date()).getTime()) : null);
            //setDate
            pds.setString(26, entity.getEmergency_link_tel_no());
            // 核准部门
            pds.setString(27, entity.getCheck_unit_code());
            //核准人
            pds.setString(28, entity.getChecker());
            //核准意见:0未审批 1核准同意 2核准不同意
            pds.setString(29, entity.getChecker_flag());
            //核准时间
            pds.setDate(30, StringUtils.isNotEmpty(entity.getCheck_date()) ? new java.sql.Date(sdf.parse(entity.getCheck_date()).getTime()) : null);
            //撤单人
            pds.setString(31, entity.getRevoker());
            //撤单时间
            pds.setDate(32, StringUtils.isNotEmpty(entity.getRevoker_date()) ? new java.sql.Date(sdf.parse(entity.getRevoker_date()).getTime()) : null);
            //申报员:申报企业信息表中的申报员字段
            pds.setString(33, entity.getDeclarer());
            //货物运输形式类型：0：集装箱 1：包装件2：散装 3：中散 4：罐柜
            pds.setString(34, entity.getTransport_type());
            //具体运输
            pds.setString(35, entity.getTransport_desc());
            //"状态：0撤单 1锁单(超时锁单) 2正常 3解锁 4改单 5锁单（出口包装必检、抽查锁单） 6-穿巴受理7-已进港 8-已出运"
            pds.setString(36, entity.getState());
            //新增人员;
            pds.setString(37, entity.getAddoperation());
            //新增时间
            pds.setDate(38, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Date(sdf.parse(entity.getAddtime()).getTime()) : null);
            //修改人员
            pds.setString(39, entity.getUpdateoperation());
            //修改时间
            pds.setDate(40, StringUtils.isNotEmpty(entity.getUpdatetime()) ? new java.sql.Date(sdf.parse(entity.getUpdatetime()).getTime()) : null);
            //是否删除
            pds.setString(41, entity.getIsremove());
            //申请单类型：0:散装 1:包装,2:进口
            pds.setString(42, entity.getDeclare_type());
            //批准文号
            pds.setString(43, entity.getApproval_number());
            //流水号，规则：yyxxxxxxx(7位流水号，每年从0开始)
            pds.setString(44, entity.getPrerecord_no());
            //解锁人
            pds.setString(45, entity.getUnlocker());
            //解锁时间
            pds.setDate(46, StringUtils.isNotEmpty(entity.getUnlock_time()) ? new java.sql.Date(sdf.parse(entity.getUnlock_time()).getTime()) : null);
            //流程id
            pds.setString(47, entity.getPid());
            // 版本号，未审批的申报单每次修改，版本号加1
            pds.setString(48, entity.getVersion());
            //事项编号
            pds.setString(49, entity.getItem_id());
            //审核说明
            pds.setString(50, entity.getCheck_option());
            // 是否需要抽查
            pds.setString(51, entity.getIs_spot_check());
            //出运时间
            pds.setDate(52, StringUtils.isNotEmpty(entity.getShipment_time()) ? new java.sql.Date(sdf.parse(entity.getShipment_time()).getTime()) : null);
            //作业总量吨
            pds.setString(53, entity.getDeclare_total_ton());
            //作业总量teu
            pds.setString(54, entity.getDeclare_total_teu());
            //作业总量件
            pds.setString(55, entity.getDeclare_total_piece());
            //改单原因，出口包装申报单改单时使用
            pds.setString(56, entity.getChange_order_reason());
            //是否必检单0否1是
            pds.setString(57, entity.getIs_must_check());
            //实际作业量（吨）
            pds.setString(58, entity.getDeclare_ton_actual());
            //实际作业量（teu）
            pds.setString(59, entity.getDeclare_teu_actual());
            //实际作业量（件）
            pds.setString(60, entity.getDeclare_piece_actual());
            //1未出运 0已出运
            pds.setString(61, entity.getIs_shipping());
            //取消原因
            pds.setString(62, entity.getCancel_reason());
            //穿巴受理时间
            pds.setDate(63, StringUtils.isNotEmpty(entity.getWear_ba_time()) ? new java.sql.Date(sdf.parse(entity.getWear_ba_time()).getTime()) : null);
            //进港时间
            pds.setDate(64, StringUtils.isNotEmpty(entity.getInto_port_time()) ? new java.sql.Date(sdf.parse(entity.getInto_port_time()).getTime()) : null);
            //申请人,申报企业id(关联hy_wharf_enterpriseaccount 中的id字段)
            pds.setString(65, entity.getMaker_id());
            //进口申报标志（5：补报）
            pds.setString(66, entity.getBuz_op_type());
            //是否有来自上港的数据更新 0有更新 1已读取更新
            pds.setString(67, entity.getChange_flag());
            //是否 补报（1是0不是）（进口）
            pds.setString(68, entity.getIsbubao());
            //是否 补报 备案 (1是 0 不是)（进口）
            pds.setString(69, entity.getIsbubaobeian());
            //船code
            pds.setString(70, entity.getVesselcode());
            pds.addBatch();
            if (index > 0 && index == 1000) {
                pds.executeBatch();
                conn.commit();
                pds.clearBatch();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void addBatchForCargo(PreparedStatement pds, Cargo206Entity entity, int index) {
        try {
            pds.setString(1, entity.getId());
            pds.setString(2, entity.getDeclare_id());    //危险物申请id
            pds.setString(3, entity.getCargo_code());    //货物名称
            pds.setString(4, entity.getDeclare_ton());    //作业吨
            pds.setString(5, entity.getDeclare_teu());    //作业teu
            pds.setString(6, entity.getDeclare_piece());    //作业件
            pds.setString(7, entity.getPackage_type());    //包装类别
            pds.setString(8, entity.getNational_no());    //cas
            pds.setString(9, entity.getInternational_no());    //联合国
            pds.setString(10, entity.getDanger_type());    //1和2的和  1.2e 3.4j
            pds.setString(11, entity.getDanger_type1());    //危险类别1
            pds.setString(12, entity.getDanger_type2());    //危险类别2
            pds.setString(13, entity.getAddoperation());    //新增人员
            pds.setTimestamp(14, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Timestamp(sdf.parse(entity.getAddtime()).getTime()) : null);    //新增时间
            pds.setString(15, entity.getUpdateoperation());    //修改人员
            pds.setTimestamp(16, StringUtils.isNotEmpty(entity.getUpdatetime()) ? new java.sql.Timestamp(sdf.parse(entity.getUpdatetime()).getTime()) : null);    //修改时间
            pds.setString(17, entity.getIsremove());    //是否删除
            pds.setString(18, entity.getTransport_name());    //运输名称
            pds.setString(19, entity.getMeasures_number());    //措施编号
            pds.setString(20, entity.getOrder_number());    //序号（出口包装使用）货物序号
            pds.setString(21, entity.getIs_ref_poison_goods());    //是否是剧毒品(0否 1是)
            pds.setString(22, entity.getContainer_no());    //箱号
            pds.setString(23, entity.getBill_no());    //提单号
            pds.setString(24, entity.getFull_box());    //整拼
            pds.setString(25, entity.getCnt_type());    //箱型
            pds.setString(26, entity.getCnt_size());    //尺寸
            pds.setString(27, entity.getBill_code());    //提单编码
            pds.setString(28, entity.getDanger_groupname());    //使用规则分组
            pds.setString(29, entity.getPxxx());    //拼箱信息
            pds.addBatch();
            if (index > 0 && index == 1000) {
                pds.executeBatch();
                conn.commit();
                pds.clearBatch();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addBatchForDocs(PreparedStatement pds, Docs206Entity entity, int index) {
        try {
            pds.setString(1, StringUtils.isNotEmpty(entity.getId()) ? entity.getId() : "");
            pds.setString(2, StringUtils.isNotEmpty(entity.getDeclare_id()) ? entity.getDeclare_id() : "");    //申报单id
            pds.setString(3, StringUtils.isNotEmpty(entity.getCargo_order_number()) ? entity.getCargo_order_number() : "");    //货品序号
            pds.setString(4, StringUtils.isNotEmpty(entity.getDocs_order_number()) ? entity.getDocs_order_number() : "");    //单证序号
            pds.setString(5, StringUtils.isNotEmpty(entity.getDocs_type()) ? entity.getDocs_type() : "");    //单证类型
            pds.setString(6, StringUtils.isNotEmpty(entity.getDocs_no()) ? entity.getDocs_no() : "");    //单证编码
            pds.setString(7, StringUtils.isNotEmpty(entity.getTotal_qty()) ? entity.getTotal_qty() : "");    //总量
            pds.setString(8, StringUtils.isNotEmpty(entity.getUsing_qty()) ? entity.getUsing_qty() : "");    //本次使用量
            pds.setTimestamp(9, StringUtils.isNotEmpty(entity.getValid_date()) ? new java.sql.Timestamp(sdf.parse(entity.getValid_date()).getTime()) : null);    //有效期
            pds.setString(10, StringUtils.isNotEmpty(entity.getIs_valid()) ? entity.getIs_valid() : "");    //是否有效(0否 1是)
            pds.setString(11, StringUtils.isNotEmpty(entity.getAddoperation()) ? entity.getAddoperation() : "");
            pds.setTimestamp(12, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Timestamp(sdf.parse(entity.getAddtime()).getTime()) : null);
            pds.setString(13, StringUtils.isNotEmpty(entity.getUpdateoperation()) ? entity.getUpdateoperation() : "");
            pds.setTimestamp(14, StringUtils.isNotEmpty(entity.getUpdatetime()) ? new java.sql.Timestamp(sdf.parse(entity.getUpdatetime()).getTime()) : null);
            pds.setString(15, StringUtils.isNotEmpty(entity.getIsremove()) ? entity.getIsremove() : "");//	是否删除(0否 1是)
            pds.addBatch();
            if (index > 0 && index == 1000) {
                pds.executeBatch();
                conn.commit();
                pds.clearBatch();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void batchUpdate(PreparedStatement pds, String uuid, int index) {
        try {
            pds.setString(1, uuid);
            pds.addBatch();
            if (index > 0 && index == 1000) {
                pds.executeBatch();
                conn.commit();
                pds.clearBatch();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
