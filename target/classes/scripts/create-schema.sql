
    alter table BILL 
        drop 
        foreign key FK_k8lgis8raxta2v3p5o1mlrm0l;

    alter table BILL 
        drop 
        foreign key FK_iewt7gtfa3qnf47psv5sot0kw;

    alter table BILL 
        drop 
        foreign key FK_3i10oy8ft98joxq6n9g03n4q2;

    alter table RESERVATION 
        drop 
        foreign key FK_91opn8g2ysx6bgw313stl47sv;

    alter table RESERVATION 
        drop 
        foreign key FK_qad782a992feueit82ujku7pk;

    alter table ROOM 
        drop 
        foreign key FK_ff4ejib913yonrg5cs31cfybm;

    alter table ROOM 
        drop 
        foreign key FK_s7fsfct2qs5ywxvvob7dna3tt;

    drop table if exists BILL;

    drop table if exists CUSTOMER;

    drop table if exists EMPLOYEE;

    drop table if exists RESERVATION;

    drop table if exists ROOM;

    drop table if exists STATUS;

    drop table if exists TYPE;

    create table BILL (
        ID_BILL integer not null auto_increment,
        BILL_DATE datetime,
        UNIT_ELECTRIC integer,
        UNIT_WATER integer,
        ID_CUSTOMER integer,
        ID_EMPLOYEE integer,
        ID_ROOM integer,
        primary key (ID_BILL)
    );

    create table CUSTOMER (
        ID_CUSTOMER integer not null auto_increment,
        ADDRESS varchar(255),
        EMAIL varchar(255),
        FIRSTNAME varchar(255),
        LASTNAME varchar(255),
        PHONE_NUMBER varchar(255),
        primary key (ID_CUSTOMER)
    );

    create table EMPLOYEE (
        ID_EMPLOYEE integer not null auto_increment,
        ADDRESS varchar(255),
        EMAIL varchar(255),
        FIRSTNAME varchar(255),
        LASTNAME varchar(255),
        PHONE_NUMBER varchar(255),
        primary key (ID_EMPLOYEE)
    );

    create table RESERVATION (
        ID_RESERVATION integer not null auto_increment,
        CHECK_IN_DATE datetime,
        CHECK_OUT_DATE datetime,
        DEPOSIT integer,
        DEPOSIT_DATE datetime,
        ID_CUSTOMER integer,
        ID_ROOM integer,
        primary key (ID_RESERVATION)
    );

    create table ROOM (
        ID_ROOM integer not null,
        STATUS_ID integer,
        TYPE_ID integer,
        primary key (ID_ROOM)
    );

    create table STATUS (
        ID_STATUS integer not null auto_increment,
        NAME varchar(255),
        primary key (ID_STATUS)
    );

    create table TYPE (
        ID_TYPE integer not null auto_increment,
        NAME varchar(255),
        PRICE varchar(255),
        primary key (ID_TYPE)
    );

    alter table BILL 
        add constraint FK_k8lgis8raxta2v3p5o1mlrm0l 
        foreign key (ID_CUSTOMER) 
        references CUSTOMER (ID_CUSTOMER);

    alter table BILL 
        add constraint FK_iewt7gtfa3qnf47psv5sot0kw 
        foreign key (ID_EMPLOYEE) 
        references EMPLOYEE (ID_EMPLOYEE);

    alter table BILL 
        add constraint FK_3i10oy8ft98joxq6n9g03n4q2 
        foreign key (ID_ROOM) 
        references ROOM (ID_ROOM);

    alter table RESERVATION 
        add constraint FK_91opn8g2ysx6bgw313stl47sv 
        foreign key (ID_CUSTOMER) 
        references CUSTOMER (ID_CUSTOMER);

    alter table RESERVATION 
        add constraint FK_qad782a992feueit82ujku7pk 
        foreign key (ID_ROOM) 
        references ROOM (ID_ROOM);

    alter table ROOM 
        add constraint FK_ff4ejib913yonrg5cs31cfybm 
        foreign key (STATUS_ID) 
        references STATUS (ID_STATUS);

    alter table ROOM 
        add constraint FK_s7fsfct2qs5ywxvvob7dna3tt 
        foreign key (TYPE_ID) 
        references TYPE (ID_TYPE);
