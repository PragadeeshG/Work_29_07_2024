create table if not exists service_access_control_list(
access_Management varchar(255) not null,
controls varchar(255) null,
global_service varchar(255) null,
network_access varchar(255) null,
file_system_id Integer null,
user_code Integer null,
sequence_number varchar(255) null,
protocol varchar(255) null,
network_acl varchar(255) null,
file_system_acl varchar(255) null,
constraint service_access_control_list_pk primary key(access_Management));