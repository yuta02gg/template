package com.diworksdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * MySQL接続に必要な情報を設定します。
 */
public class DBConnector {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/ecsite";
    private static String user = "root";
    private static String password = "";

    /**
     * 接続情報から自分のパソコンにインストールされているMySQLへ接続する準備を整えます。
     * @return Connection オブジェクト
     */
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
