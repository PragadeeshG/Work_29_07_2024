create table if not exists access_control_permissons(
acl_code bigint not null,
sequence_number varchar(255) null,
acl_name varchar(255) null,
is_active char null,
is_allowed char null,
version varchar(255) null,
statement varchar(255) null,
remark varchar(255) null,
network_protocol varchar(255) null,
source varchar(255) null,
log_available char null,
destination_network bigint null,
advanced_acl varchar(255) null,
other_criteria varchar(255) null,
network_layer varchar(255) null,
security_device varchar(255) null,
constraint access_control_permissons_pk primary key(acl_code));