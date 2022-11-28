CREATE TABLE Roles
(
    roleid int not null auto_increment,
    rolename varchar(80) not null,
    teamseditallowed bit not null,
    userseditallowed bit not null,
    projectseditallowed bit not null,
    PRIMARY KEY(roleid)
);

CREATE TABLE Projects
(
    projectid int not null auto_increment,
    projectname varchar(80) not null,
    projectdescription varchar(600) not null,
    PRIMARY KEY(projectid)
);

CREATE TABLE Teams
(
    teamid int NOT NULL auto_increment,
    teamname varchar(80) NOT NULL,
    PRIMARY KEY(teamid)
);


CREATE TABLE Users (
    userid int not null auto_increment,
    username varchar(80) not null,
    password varchar(64) not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    roleid int null,
    PRIMARY KEY(userid),
    foreign key (roleid) references Roles(roleid)
);

CREATE TABLE DeveloperInTeam (
    userid int NOT NULL,
    teamid int NOT NULL,
    foreign key (teamid) references Teams(teamid),
    foreign key (userid) references Users(userid)
);

CREATE TABLE TeamLeaderOfTeam (
    leaderid int not null,
    teamid int not null,
    foreign key (leaderid) references Users(userid),
    foreign key (teamid) references Teams(teamid)
);