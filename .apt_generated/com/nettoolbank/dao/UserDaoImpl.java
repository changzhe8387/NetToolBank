package com.nettoolbank.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.1" }, date = "2017-06-29T10:21:45.591+0900")
public class UserDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.nettoolbank.dao.UserDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.nettoolbank.dao.UserDao.class, "selectByUsernamePassword", java.lang.String.class, java.lang.String.class);

    /** */
    public UserDaoImpl() {
        super(com.nettoolbank.config.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public UserDaoImpl(java.sql.Connection connection) {
        super(com.nettoolbank.config.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public UserDaoImpl(javax.sql.DataSource dataSource) {
        super(com.nettoolbank.config.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected UserDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public com.nettoolbank.entity.UserEntity selectByUsernamePassword(java.lang.String userName, java.lang.String password) {
        entering("com.nettoolbank.dao.UserDaoImpl", "selectByUsernamePassword", userName, password);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/nettoolbank/dao/UserDao/selectByUsernamePassword.sql");
            __query.setEntityType(com.nettoolbank.entity._UserEntity.getSingletonInternal());
            __query.addParameter("userName", java.lang.String.class, userName);
            __query.addParameter("password", java.lang.String.class, password);
            __query.setCallerClassName("com.nettoolbank.dao.UserDaoImpl");
            __query.setCallerMethodName("selectByUsernamePassword");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.nettoolbank.entity.UserEntity> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.nettoolbank.entity.UserEntity>(com.nettoolbank.entity._UserEntity.getSingletonInternal()));
            com.nettoolbank.entity.UserEntity __result = __command.execute();
            __query.complete();
            exiting("com.nettoolbank.dao.UserDaoImpl", "selectByUsernamePassword", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.nettoolbank.dao.UserDaoImpl", "selectByUsernamePassword", __e);
            throw __e;
        }
    }

}
