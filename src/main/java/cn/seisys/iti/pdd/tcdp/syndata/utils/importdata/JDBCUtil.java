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
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
        if (conn == null || changeFlag) {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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


    public void addBatchForCargo(PreparedStatement pds, Cargo206Entity entity, int index) {
        try {
            pds.setString(1, StringUtils.isNotEmpty(entity.getId()) ? entity.getId() : "");
            pds.setString(2, StringUtils.isNotEmpty(entity.getDeclare_code()) ? entity.getDeclare_code() : "");
            pds.setString(3, StringUtils.isNotEmpty(entity.getCargo_code()) ? entity.getDeclare_code() : "");
            pds.setString(4, StringUtils.isNotEmpty(entity.getDeclare_ton()) ? entity.getDeclare_ton() : "");
            pds.setString(5, StringUtils.isNotEmpty(entity.getDeclare_teu()) ? entity.getDeclare_teu() : "");
            pds.setString(6, StringUtils.isNotEmpty(entity.getDeclare_piece()) ? entity.getDeclare_piece() : "");
            pds.setString(7, StringUtils.isNotEmpty(entity.getPackage_type()) ? entity.getPackage_type() : "");
            pds.setString(8, StringUtils.isNotEmpty(entity.getCas_no()) ? entity.getCas_no() : "");
            pds.setString(9, StringUtils.isNotEmpty(entity.getUn_no()) ? entity.getUn_no() : "");
            pds.setString(10, StringUtils.isNotEmpty(entity.getDanger_type()) ? entity.getDanger_type() : "");
            pds.setString(11, StringUtils.isNotEmpty(entity.getDanger_type1()) ? entity.getDanger_type1() : "");
            pds.setString(12, StringUtils.isNotEmpty(entity.getDanger_type2()) ? entity.getDanger_type2() : "");
            pds.setString(13, StringUtils.isNotEmpty(entity.getIsremove()) ? entity.getIsremove() : "");
            pds.setString(14, StringUtils.isNotEmpty(entity.getTransport_name()) ? entity.getTransport_name() : "");
            pds.setString(15, StringUtils.isNotEmpty(entity.getMeasures_number()) ? entity.getMeasures_number() : "");
            pds.setString(16, StringUtils.isNotEmpty(entity.getOrder_number()) ? entity.getOrder_number() : "");
            pds.setString(17, StringUtils.isNotEmpty(entity.getIs_ref_poison_goods()) ? entity.getIs_ref_poison_goods() : "");
            pds.setString(18, StringUtils.isNotEmpty(entity.getSyn_item()) ? entity.getSyn_item() : "");
            pds.setString(19, StringUtils.isNotEmpty(entity.getSyn_flag()) ? entity.getSyn_flag() : "");
            pds.setTimestamp(20, StringUtils.isNotEmpty(entity.getSyn_time()) ? new java.sql.Timestamp(sdf.parse(entity.getSyn_time()).getTime()) : null);
            pds.setString(21, StringUtils.isNotEmpty(entity.getDanger_type_split()) ? entity.getDanger_type_split() : "");
            pds.setString(22, StringUtils.isNotEmpty(entity.getDeclare_id()) ? entity.getDeclare_id() : "");
            pds.setString(23, StringUtils.isNotEmpty(entity.getDanger_groupname()) ? entity.getDanger_groupname() : "");
            pds.setTimestamp(24, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Timestamp(sdf.parse(entity.getAddtime()).getTime()) : null);
            pds.setString(25, StringUtils.isNotEmpty(entity.getContainer_no()) ? entity.getContainer_no() : "");
            pds.setString(26, StringUtils.isNotEmpty(entity.getBill_no()) ? entity.getBill_no() : "");
            pds.setString(27, StringUtils.isNotEmpty(entity.getFull_box()) ? entity.getFull_box() : "");
            pds.setString(28, StringUtils.isNotEmpty(entity.getCnt_type()) ? entity.getCnt_type() : "");
            pds.setString(29, StringUtils.isNotEmpty(entity.getCnt_size()) ? entity.getCnt_size() : "");
            pds.setString(30, StringUtils.isNotEmpty(entity.getBill_code()) ? entity.getBill_code() : "");
            pds.setString(31, StringUtils.isNotEmpty(entity.getUuid()) ? entity.getUuid() : "");
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

    public void addBatchForDeclare(PreparedStatement pds, Declare206Entity entity, int index) {
        try {
            pds.setString(1, StringUtils.isNotEmpty(entity.getId()) ? entity.getId() : "");
            pds.setString(2, StringUtils.isNotEmpty(entity.getMaker()) ? entity.getMaker() : "");
            pds.setTimestamp(3, StringUtils.isNotEmpty(entity.getMake_date()) ? new java.sql.Timestamp(sdf.parse(entity.getMake_date()).getTime()) : null);
            pds.setString(4, StringUtils.isNotEmpty(entity.getDeclare_code()) ? entity.getDeclare_code() : "");
            pds.setString(5, StringUtils.isNotEmpty(entity.getApproval_number()) ? entity.getApproval_number() : "");
            pds.setString(6, StringUtils.isNotEmpty(entity.getNew_declare_code()) ? entity.getNew_declare_code() : "");
            pds.setString(7, StringUtils.isNotEmpty(entity.getUnit_code()) ? entity.getUnit_code() : "");
            pds.setString(8, StringUtils.isNotEmpty(entity.getConsigner()) ? entity.getConsigner() : "");
            pds.setString(9, StringUtils.isNotEmpty(entity.getShip_name()) ? entity.getShip_name() : "");
            pds.setString(10, StringUtils.isNotEmpty(entity.getVoyage_number_code()) ? entity.getVoyage_number_code() : "");
            pds.setString(11, StringUtils.isNotEmpty(entity.getAddress()) ? entity.getAddress() : "");
            pds.setString(12, StringUtils.isNotEmpty(entity.getFrom_port_code()) ? entity.getFrom_port_code() : "");
            pds.setString(13, StringUtils.isNotEmpty(entity.getTo_port_code()) ? entity.getTo_port_code() : "");
            pds.setTimestamp(14, StringUtils.isNotEmpty(entity.getPre_start_date()) ? new java.sql.Timestamp(sdf.parse(entity.getPre_start_date()).getTime()) : null);
            pds.setTimestamp(15, StringUtils.isNotEmpty(entity.getPre_end_date()) ? new java.sql.Timestamp(sdf.parse(entity.getPre_end_date()).getTime()) : null);
            pds.setString(16, StringUtils.isNotEmpty(entity.getPack_code()) ? entity.getPack_code() : "");
            pds.setString(17, StringUtils.isNotEmpty(entity.getMerge_container_code()) ? entity.getMerge_container_code() : "");
            pds.setString(18, StringUtils.isNotEmpty(entity.getHandle_mode()) ? entity.getHandle_mode() : "");
            pds.setString(19, StringUtils.isNotEmpty(entity.getAdd_info()) ? entity.getAdd_info() : "");
            pds.setString(20, StringUtils.isNotEmpty(entity.getEmergency_code()) ? entity.getEmergency_code() : "");
            pds.setString(21, StringUtils.isNotEmpty(entity.getDeclare_unit()) ? entity.getDeclare_unit() : "");
            pds.setTimestamp(22, StringUtils.isNotEmpty(entity.getDeclare_date()) ? new java.sql.Timestamp(sdf.parse(entity.getDeclare_date()).getTime()) : null);
            pds.setString(23, StringUtils.isNotEmpty(entity.getEmergency_link_tel_no()) ? entity.getEmergency_link_tel_no() : "");
            pds.setString(24, StringUtils.isNotEmpty(entity.getCheck_unit_code()) ? entity.getCheck_unit_code() : "");
            pds.setString(25, StringUtils.isNotEmpty(entity.getChecker()) ? entity.getChecker() : "");
            pds.setString(26, StringUtils.isNotEmpty(entity.getChecker_flag()) ? entity.getChecker_flag() : "");
            pds.setTimestamp(27, StringUtils.isNotEmpty(entity.getCheck_date()) ? new java.sql.Timestamp(sdf.parse(entity.getCheck_date()).getTime()) : null);
            pds.setString(28, StringUtils.isNotEmpty(entity.getCheck_option()) ? entity.getCheck_option() : "");
            pds.setString(29, StringUtils.isNotEmpty(entity.getRevoker()) ? entity.getRevoker() : "");
            pds.setTimestamp(30, StringUtils.isNotEmpty(entity.getRevoker_date()) ? new java.sql.Timestamp(sdf.parse(entity.getRevoker_date()).getTime()) : null);
            pds.setString(31, StringUtils.isNotEmpty(entity.getUnlocker()) ? entity.getUnlocker() : "");
            pds.setTimestamp(32, StringUtils.isNotEmpty(entity.getUnlock_time()) ? new java.sql.Timestamp(sdf.parse(entity.getUnlock_time()).getTime()) : null);
            pds.setString(33, StringUtils.isNotEmpty(entity.getDeclarer()) ? entity.getDeclarer() : "");
            pds.setString(34, StringUtils.isNotEmpty(entity.getTransport_type()) ? entity.getTransport_type() : "");
            pds.setString(35, StringUtils.isNotEmpty(entity.getTransport_desc()) ? entity.getTransport_desc() : "");
            pds.setString(36, StringUtils.isNotEmpty(entity.getState()) ? entity.getState() : "");
            pds.setString(37, StringUtils.isNotEmpty(entity.getDeclare_type()) ? entity.getDeclare_type() : "");
            pds.setString(38, StringUtils.isNotEmpty(entity.getPrerecord_no()) ? entity.getPrerecord_no() : "");
            pds.setString(39, StringUtils.isNotEmpty(entity.getVersion()) ? entity.getVersion() : "");
            pds.setString(40, StringUtils.isNotEmpty(entity.getChange_order_reason()) ? entity.getChange_order_reason() : "");
            pds.setString(41, StringUtils.isNotEmpty(entity.getIs_spot_check()) ? entity.getIs_spot_check() : "");
            pds.setString(42, StringUtils.isNotEmpty(entity.getDeclare_total_teu()) ? entity.getDeclare_total_teu() : "");
            pds.setString(43, StringUtils.isNotEmpty(entity.getDeclare_total_ton()) ? entity.getDeclare_total_ton() : "");
            pds.setString(44, StringUtils.isNotEmpty(entity.getDeclare_total_piece()) ? entity.getDeclare_total_piece() : "");
            pds.setString(45, StringUtils.isNotEmpty(entity.getIs_must_check()) ? entity.getIs_must_check() : "");
            pds.setString(46, StringUtils.isNotEmpty(entity.getSyn_item()) ? entity.getSyn_item() : "");
            pds.setString(47, StringUtils.isNotEmpty(entity.getSyn_flag()) ? entity.getSyn_flag() : "");
            pds.setTimestamp(48, StringUtils.isNotEmpty(entity.getSyn_time()) ? new java.sql.Timestamp(sdf.parse(entity.getSyn_time()).getTime()) : null);
            pds.setString(49, StringUtils.isNotEmpty(entity.getSyn_type()) ? entity.getSyn_type() : "");
            pds.setTimestamp(50, StringUtils.isNotEmpty(entity.getShipment_time()) ? new java.sql.Timestamp(sdf.parse(entity.getShipment_time()).getTime()) : null);
            pds.setTimestamp(51, StringUtils.isNotEmpty(entity.getLeaving_port_time()) ? new java.sql.Timestamp(sdf.parse(entity.getLeaving_port_time()).getTime()) : null);
            pds.setTimestamp(52, StringUtils.isNotEmpty(entity.getWear_ba_time()) ? new java.sql.Timestamp(sdf.parse(entity.getWear_ba_time()).getTime()) : null);
            pds.setString(53, StringUtils.isNotEmpty(entity.getIs_wear_ba()) ? entity.getIs_wear_ba() : "");
            pds.setTimestamp(54, StringUtils.isNotEmpty(entity.getPort_meaasge_get_time()) ? new java.sql.Timestamp(sdf.parse(entity.getPort_meaasge_get_time()).getTime()) : null);
            pds.setString(55, StringUtils.isNotEmpty(entity.getPort_meaasge_get_flag()) ? entity.getPort_meaasge_get_flag() : "");
            pds.setString(56, StringUtils.isNotEmpty(entity.getIs_locked()) ? entity.getIs_locked() : "");
            pds.setTimestamp(57, StringUtils.isNotEmpty(entity.getDanger_storage_time()) ? new java.sql.Timestamp(sdf.parse(entity.getDanger_storage_time()).getTime()) : null);
            pds.setString(58, StringUtils.isNotEmpty(entity.getDanger_storage_confirm_sign()) ? entity.getDanger_storage_confirm_sign() : "");
            pds.setString(59, StringUtils.isNotEmpty(entity.getDeclare_ton_actual()) ? entity.getDeclare_ton_actual() : "");
            pds.setString(60, StringUtils.isNotEmpty(entity.getDeclare_teu_actual()) ? entity.getDeclare_teu_actual() : "");
            pds.setString(61, StringUtils.isNotEmpty(entity.getDeclare_piece_actual()) ? entity.getDeclare_piece_actual() : "");
            pds.setTimestamp(62, StringUtils.isNotEmpty(entity.getInto_port_time()) ? new java.sql.Timestamp(sdf.parse(entity.getInto_port_time()).getTime()) : null);
            pds.setString(63, StringUtils.isNotEmpty(entity.getLock_type()) ? entity.getLock_type() : "");
            pds.setString(64, StringUtils.isNotEmpty(entity.getMaker_id()) ? entity.getMaker_id() : "");
            pds.setString(65, StringUtils.isNotEmpty(entity.getDeclare_id()) ? entity.getDeclare_id() : "");
            pds.setString(66, StringUtils.isNotEmpty(entity.getIs_ref_poison_goods()) ? entity.getIs_ref_poison_goods() : "");
            pds.setString(67, StringUtils.isNotEmpty(entity.getDeclare_unit_code()) ? entity.getDeclare_unit_code() : "");
            pds.setTimestamp(68, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Timestamp(sdf.parse(entity.getAddtime()).getTime()) : null);
            pds.setString(69, StringUtils.isNotEmpty(entity.getUuid()) ? entity.getUuid() : "");
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
            pds.setString(2, StringUtils.isNotEmpty(entity.getDeclare_code()) ? entity.getDeclare_code() : "");
            pds.setString(3, StringUtils.isNotEmpty(entity.getCargo_order_number()) ? entity.getCargo_order_number() : "");
            pds.setString(4, StringUtils.isNotEmpty(entity.getDocs_order_number()) ? entity.getDocs_order_number() : "");
            pds.setString(5, StringUtils.isNotEmpty(entity.getDocs_type()) ? entity.getDocs_type() : "");
            pds.setString(6, StringUtils.isNotEmpty(entity.getDocs_no()) ? entity.getDocs_no() : "");
            pds.setString(7, StringUtils.isNotEmpty(entity.getTotal_qty()) ? entity.getTotal_qty() : "");
            pds.setString(8, StringUtils.isNotEmpty(entity.getUsing_qty()) ? entity.getUsing_qty() : "");
            pds.setTimestamp(9, StringUtils.isNotEmpty(entity.getValid_date()) ? new java.sql.Timestamp(sdf.parse(entity.getValid_date()).getTime()) : null);
            pds.setString(10, StringUtils.isNotEmpty(entity.getIs_valid()) ? entity.getIs_valid() : "");
            pds.setString(11, StringUtils.isNotEmpty(entity.getAddoperation()) ? entity.getAddoperation() : "");
            pds.setTimestamp(12, StringUtils.isNotEmpty(entity.getAddtime()) ? new java.sql.Timestamp(sdf.parse(entity.getAddtime()).getTime()) : null);
            pds.setString(13, StringUtils.isNotEmpty(entity.getIsremove()) ? entity.getIsremove() : "");
            pds.setString(14, StringUtils.isNotEmpty(entity.getSyn_item()) ? entity.getSyn_item() : "");
            pds.setString(15, StringUtils.isNotEmpty(entity.getSyn_flag()) ? entity.getSyn_flag() : "");
            pds.setTimestamp(16, StringUtils.isNotEmpty(entity.getSyn_time()) ? new java.sql.Timestamp(sdf.parse(entity.getSyn_time()).getTime()) : null);
            pds.setString(17, StringUtils.isNotEmpty(entity.getDeclare_id()) ? entity.getDeclare_id() : "");
            pds.setString(18, StringUtils.isNotEmpty(entity.getUuid()) ? entity.getUuid() : "");
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
