insert into post (id, title, content, author)
values (1, 'Some title 1', 'Some long content 1', 'John Doe');
insert into post (id, title, content, author)
values (2, 'Some title 2', 'Some long content 2', 'John Doe');
insert into post (id, title, content, author)
values (3, 'Some title 3', 'Some long content 3', 'John Doe');
insert into post (id, title, content, author)
values (4, 'Some title 4', 'Some long content 4', 'John Doe');
insert into post (id, title, content, author)
values (5, 'Some title 5', 'Some long content 5', 'John Doe');

insert into comment (id, content, author, post_id)
values (1, 'some comment on post1 ', 'John Doe', 1);
insert into comment (id, content, author, post_id)
values (2, 'some comment on post1 ', 'John Doe', 1);
insert into comment (id, content, author, post_id)
values (3, 'some comment on post2 ', 'John Doe', 2);
insert into comment (id, content, author, post_id)
values (4, 'some comment on post3 ', 'John Doe', 3);
insert into comment (id, content, author, post_id)
values (5, 'some comment on post4 ', 'John Doe', 4);
insert into comment (id, content, author, post_id)
values (6, 'some comment on post4 ', 'John Doe', 4);
insert into comment (id, content, author, post_id)
values (7, 'some comment on post4 ', 'John Doe', 4);
insert into comment (id, content, author, post_id)
values (8, 'some comment on post5 ', 'John Doe', 5);
select *
from comment c
         inner join post p on c.post_id = p.id