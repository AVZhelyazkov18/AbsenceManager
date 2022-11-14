
CREATE TABLE Roles
(
    id int not null auto_increment,
    rolename varchar(80) not null,
    PRIMARY KEY(id)
);

CREATE TABLE Projects
(
    id int not null auto_increment,
    name varchar(80) not null,
    description varchar(600) not null,
    PRIMARY KEY(id)
);

CREATE TABLE Teams
(
    id int NOT NULL auto_increment,
    teamname varchar(80) NOT NULL,
    workers varchar(80) NULL,
    leader int NULL,
    PRIMARY KEY(id)
);


CREATE TABLE Users (
    userid int not null auto_increment,
    username varchar(80) not null,
    password varchar(64) not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    roleid int null,
    teamid int null,
    PRIMARY KEY(userid),
    foreign key (roleid) references Roles(id)
);

CREATE TABLE UserInTeam (
    userid int NOT NULL,
    teamid int NOT NULL,
    foreign key (teamid) references Teams(id),
    foreign key (userid) references Users(userid)
)