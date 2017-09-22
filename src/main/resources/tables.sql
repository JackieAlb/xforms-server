-- Table: public.x_meta_kind

-- DROP TABLE public.x_meta_kind;

CREATE TABLE public.x_meta_kind
(
    meta_kind_id character varying(32) COLLATE pg_catalog."default" NOT NULL,
    meta_kind_name character varying(64) COLLATE pg_catalog."default" NOT NULL,
    meta_kind_desc character varying(128) COLLATE pg_catalog."default",
    meta_kind_parent_id character varying(32) COLLATE pg_catalog."default",
    CONSTRAINT x_meta_kind_pkey PRIMARY KEY (meta_kind_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.x_meta_kind
    OWNER to postgres;
    

-- Table: public.x_users

-- DROP TABLE public.x_users;

CREATE TABLE public.x_users
(
    id integer NOT NULL DEFAULT nextval('x_users_id_seq'::regclass),
    user_id character varying(50) COLLATE pg_catalog."default" NOT NULL,
    user_name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    password character varying(256) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT x_users_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.x_users
    OWNER to xiegz;
COMMENT ON TABLE public.x_users
    IS '用户表';

COMMENT ON COLUMN public.x_users.user_id
    IS '用户ID';

COMMENT ON COLUMN public.x_users.user_name
    IS '用户名称';

COMMENT ON COLUMN public.x_users.password
    IS '用户密码';