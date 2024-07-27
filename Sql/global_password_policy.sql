create table if not exists global_password_policy(
policy_id bigint not null,
acl_code Integer null,
has_uppercase varchar(255) null,
has_lower_case varchar(255) null,
has_non_numeric varchar(255) null,
has_numbers varchar(255) null,
repeated_password_count Integer null,
password_expiration varchar(255) null,
minimum_length Integer null,
constraint global_password_policy_pk primary key(policy_id));