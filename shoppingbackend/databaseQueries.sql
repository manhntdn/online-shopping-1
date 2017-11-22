create table category (
	id IDENTITY,
	name varchar(50),
	description varchar(250),
	image_url varchar(50),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id)
);