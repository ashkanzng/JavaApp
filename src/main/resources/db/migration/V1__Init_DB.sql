CREATE TABLE IF NOT EXISTS category
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    title text COLLATE pg_catalog."default",
    user_id bigint NOT NULL,
    CONSTRAINT category_pkey PRIMARY KEY (id),
    CONSTRAINT user_fkey FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

    TABLESPACE pg_default;



CREATE TABLE IF NOT EXISTS priority
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    title text COLLATE pg_catalog."default",
    color text COLLATE pg_catalog."default",
    user_id bigint NOT NULL,
    CONSTRAINT priority_pkey PRIMARY KEY (id),
    CONSTRAINT user_fkey FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

    TABLESPACE pg_default;



CREATE TABLE IF NOT EXISTS task
(
    title text COLLATE pg_catalog."default",
    completed text COLLATE pg_catalog."default",
    task_date time with time zone,
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    category_id bigint,
    priority_id bigint,
    user_id bigint NOT NULL,
    CONSTRAINT task_pkey PRIMARY KEY (id),
    CONSTRAINT category_fkey FOREIGN KEY (category_id)
        REFERENCES category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT priority_fkey FOREIGN KEY (priority_id)
        REFERENCES priority (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT user_fkey FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

    TABLESPACE pg_default;


CREATE TABLE IF NOT EXISTS users
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    username text COLLATE pg_catalog."default",
    email text COLLATE pg_catalog."default",
    password text COLLATE pg_catalog."default",
    home_street text COLLATE pg_catalog."default",
    home_region text COLLATE pg_catalog."default",
    home_zip_code text COLLATE pg_catalog."default",
    office_street text COLLATE pg_catalog."default",
    office_zip_code text COLLATE pg_catalog."default",
    office_region text COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;
