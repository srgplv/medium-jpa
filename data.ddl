create table file_upload
(
    pk_id varchar(36),
    file_path varchar(4000),
    file_type integer,
    create_date timestamp with time zone default now()
);

alter table file_upload owner to srgplv;