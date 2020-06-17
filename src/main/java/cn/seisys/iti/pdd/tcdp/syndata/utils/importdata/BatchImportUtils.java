package cn.seisys.iti.pdd.tcdp.syndata.utils.importdata;


import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Cargo206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Declare206Entity;
import cn.seisys.iti.pdd.tcdp.syndata.manage.source1.entity.Docs206Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class BatchImportUtils {
    public static Connection conn = null;

    public static void batchImportDataForCargo15Entity(List<Cargo206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "INSERT INTO SYN_DANGER_PRE_DECLARE_CARGO (ID," +
                "DECLARE_CODE," +
                "CARGO_CODE," +
                "DECLARE_TON," +
                "DECLARE_TEU," +
                "DECLARE_PIECE," +
                "PACKAGE_TYPE," +
                "CAS_NO," +
                "UN_NO," +
                "DANGER_TYPE," +
                "DANGER_TYPE1," +
                "DANGER_TYPE2," +
                "ISREMOVE," +
                "TRANSPORT_NAME," +
                "MEASURES_NUMBER," +
                "ORDER_NUMBER," +
                "IS_REF_POISON_GOODS," +
                "SYN_ITEM," +
                "SYN_FLAG," +
                "SYN_TIME," +
                "DANGER_TYPE_SPLIT," +
                "DECLARE_ID," +
                "DANGER_GROUPNAME," +
                "ADDTIME," +
                "CONTAINER_NO," +
                "BILL_NO," +
                "FULL_BOX," +
                "CNT_TYPE," +
                "CNT_SIZE," +
                "BILL_CODE," +
                "UUID) values ( ?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?,?)";

        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.addBatchForCargo(pds, commonList.get(i), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
    }

    public static void batchImportDataForDeclare15Entity(List<Declare206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "INSERT INTO SYN_HY_DANGER_PRE_DECLARE (ID," +
                "MAKER," +
                "MAKE_DATE," +
                "DECLARE_CODE," +
                "APPROVAL_NUMBER," +
                "NEW_DECLARE_CODE," +
                "UNIT_CODE," +
                "CONSIGNER," +
                "SHIP_NAME," +
                "VOYAGE_NUMBER_CODE," +
                "ADDRESS," +
                "FROM_PORT_CODE," +
                "TO_PORT_CODE," +
                "PRE_START_DATE," +
                "PRE_END_DATE," +
                "PACK_CODE," +
                "MERGE_CONTAINER_CODE," +
                "HANDLE_MODE," +
                "ADD_INFO," +
                "EMERGENCY_CODE," +
                "DECLARE_UNIT," +
                "DECLARE_DATE," +
                "EMERGENCY_LINK_TEL_NO," +
                "CHECK_UNIT_CODE," +
                "CHECKER," +
                "CHECKER_FLAG," +
                "CHECK_DATE," +
                "CHECK_OPTION," +
                "REVOKER," +
                "REVOKER_DATE," +
                "UNLOCKER," +
                "UNLOCK_TIME," +
                "DECLARER," +
                "TRANSPORT_TYPE," +
                "TRANSPORT_DESC," +
                "STATE," +
                "DECLARE_TYPE," +
                "PRERECORD_NO," +
                "VERSION," +
                "CHANGE_ORDER_REASON," +
                "IS_SPOT_CHECK," +
                "DECLARE_TOTAL_TEU," +
                "DECLARE_TOTAL_TON," +
                "DECLARE_TOTAL_PIECE," +
                "IS_MUST_CHECK," +
                "SYN_ITEM," +
                "SYN_FLAG," +
                "SYN_TIME," +
                "SYN_TYPE," +
                "SHIPMENT_TIME," +
                "LEAVING_PORT_TIME," +
                "WEAR_BA_TIME," +
                "IS_WEAR_BA," +
                "PORT_MEAASGE_GET_TIME," +
                "PORT_MEAASGE_GET_FLAG," +
                "IS_LOCKED," +
                "DANGER_STORAGE_TIME," +
                "DANGER_STORAGE_CONFIRM_SIGN," +
                "DECLARE_TON_ACTUAL," +
                "DECLARE_TEU_ACTUAL," +
                "DECLARE_PIECE_ACTUAL," +
                "INTO_PORT_TIME," +
                "LOCK_TYPE," +
                "MAKER_ID," +
                "DECLARE_ID," +
                "IS_REF_POISON_GOODS," +
                "DECLARE_UNIT_CODE," +
                "ADDTIME," +
                "UUID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.addBatchForDeclare(pds, commonList.get(i), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
    }

    public static void batchImportDataForDocs15Entity(List<Docs206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "INSERT INTO SYN_HY_DANGER_CARGO_DOCS (ID," +
                "DECLARE_CODE," +
                "CARGO_ORDER_NUMBER," +
                "DOCS_ORDER_NUMBER," +
                "DOCS_TYPE," +
                "DOCS_NO," +
                "TOTAL_QTY," +
                "USING_QTY," +
                "VALID_DATE," +
                "IS_VALID," +
                "ADDOPERATION," +
                "ADDTIME," +
                "ISREMOVE," +
                "SYN_ITEM," +
                "SYN_FLAG," +
                "SYN_TIME," +
                "DECLARE_ID," +
                "UUID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.addBatchForDocs(pds, commonList.get(i), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
    }


    public static void batchUpdateForCargo15Entity(List<Cargo206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "UPDATE SYN_DANGER_PRE_DECLARE_CARGO SET SYN_FLAG = 1 where UUID = ?";
        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.batchUpdate(pds, commonList.get(i).getUuid(), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
        pds.close();
    }

    public static void batchUpdateForDeclare15Entity(List<Declare206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "UPDATE SYN_HY_DANGER_PRE_DECLARE SET SYN_FLAG = 1 where UUID = ?";
        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.batchUpdate(pds, commonList.get(i).getUuid(), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
        pds.close();
    }

    public static void batchUpdateForDocs15Entity(List<Docs206Entity> commonList, String databaseurl, String databaseusername, String databasepassword) throws Exception {
        JDBCUtil jdbcUtil = new JDBCUtil(databaseurl, databaseusername, databasepassword);
        conn = jdbcUtil.getConn(true);
        String sql = "UPDATE SYN_HY_DANGER_CARGO_DOCS SET SYN_FLAG = 1 where UUID = ?";
        PreparedStatement pds = conn.prepareStatement(sql);
        ///获取bo里边的相关数据
        for (int i = 0; i < commonList.size(); i++) {
            jdbcUtil.batchUpdate(pds, commonList.get(i).getUuid(), i);
        }
        pds.executeBatch();
        conn.commit();
        pds.clearBatch();
        pds.close();
    }
}
