package com.nettoolbank.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.1" }, date = "2017-06-29T10:21:15.188+0900")
public final class _UserEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.nettoolbank.entity.UserEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.1");
    }

    private static final _UserEntity __singleton = new _UserEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the userName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.nettoolbank.entity.UserEntity, java.lang.String, Object> $userName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.nettoolbank.entity.UserEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "userName", "USER_NAME", __namingType, true, true, false);

    /** the password */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.nettoolbank.entity.UserEntity, java.lang.String, Object> $password = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.nettoolbank.entity.UserEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "password", "PASSWORD", __namingType, true, true, false);

    /** the userEmail */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.nettoolbank.entity.UserEntity, java.lang.String, Object> $userEmail = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.nettoolbank.entity.UserEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "userEmail", "EMAIL", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.nettoolbank.entity.UserEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __entityPropertyTypeMap;

    private _UserEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> __map = new java.util.HashMap<>(3);
        __list.add($userName);
        __map.put("userName", $userName);
        __list.add($password);
        __map.put("password", $password);
        __list.add($userEmail);
        __map.put("userEmail", $userEmail);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.nettoolbank.entity.UserEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.nettoolbank.entity.UserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.nettoolbank.entity.UserEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.nettoolbank.entity.UserEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.nettoolbank.entity.UserEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.nettoolbank.entity.UserEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.nettoolbank.entity.UserEntity, ?>> __args) {
        com.nettoolbank.entity.UserEntity entity = new com.nettoolbank.entity.UserEntity();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<com.nettoolbank.entity.UserEntity> getEntityClass() {
        return com.nettoolbank.entity.UserEntity.class;
    }

    @Override
    public com.nettoolbank.entity.UserEntity getOriginalStates(com.nettoolbank.entity.UserEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.nettoolbank.entity.UserEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserEntity newInstance() {
        return new _UserEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.nettoolbank.entity.UserEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
