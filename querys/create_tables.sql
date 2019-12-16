create table Units(
    units_id bigint AUTO_INCREMENT primary key,
    short_name varchar(3),
    long_name varchar(128)
);

create table Exercise (
    exercise_id bigint AUTO_INCREMENT primary key,
    exercise_name varchar(128),
    units_id bigint,
    FOREIGN KEY (units_id) REFERENCES Units(units_id)
);

create table GYMUser (
    user_id bigint AUTO_INCREMENT PRIMARY KEY,
    email varchar(128),
    status varchar(1),
    CHECK (status in ('A','B')),
    firstname varchar(128),
    lastname varchar(128)
);

create table Timetable(
    timetable_id bigint AUTO_INCREMENT primary key,
    user_id bigint,
    timetable_name varchar(128),
    FOREIGN KEY (user_id) REFERENCES GYMUser(user_id)
);

create table Exercise_in_timetable(
    timetable_id bigint ,
    day_of_week int,
    exercise_id bigint,
    CONSTRAINT CHK_DayOfWeek check(day_of_week>=0 and day_of_week<7),
    PRIMARY KEY (timetable_id,day_of_week,exercise_id),
    FOREIGN KEY (timetable_id) REFERENCES Timetable(timetable_id),
    FOREIGN KEY (exercise_id) REFERENCES Exercise(exercise_id)
);

create table Series (
    series_id bigint AUTO_INCREMENT primary key,
    user_id bigint,
    workout_datetime datetime,
    exercise_id bigint,
    repetitions int,
    measure float,
    FOREIGN KEY (user_id) REFERENCES GYMUser(user_id),
    FOREIGN KEY (exercise_id) REFERENCES Exercise(exercise_id)
);