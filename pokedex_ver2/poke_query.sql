use pokedex;
drop table if exists pokedextbl;

create table if not exists pokedextbl(
	pokenum int auto_increment primary key,
    pokeno varchar(10) not null,
    pokename varchar(20) not null,
    poketype1 varchar(10) not null,
    poketype2 varchar(10) not null,
    pokeclass varchar(10) not null,
    pokegender varchar(5)
);

insert into pokedextbl values (null, "NO.1", "메타몽", "무", "젤리", "슬라임", "무성");

commit;