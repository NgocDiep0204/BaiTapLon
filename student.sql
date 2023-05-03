create database studentmanagement;
use studentmanagement;

create table student (
		s_id varchar(10)  not null,
        s_name varchar(50) not null,
        sex varchar(10)		not null,
        date_of_birth  varchar(30)	not null,
        address  varchar(50) not null,
        classes  varchar(50) not null,
        course varchar(50) not null,
        majors varchar(50) not null,
        primary key(s_id)
);
create table points (
	s_id varchar(10) not null,
    semester varchar(50) not null,
    gpa	float not null,
    foreign key(s_id) references student(s_id)
);

create table points_detail(
	s_id varchar(20) not null,
	semester varchar(50) not null,
    subjects varchar(50) not null,
    points  float not null,
    credits int not null,
    foreign key(s_id) references student(s_id)
);

   insert into student
   values ('211212001', N'Hoàng Thị A',  N'Nữ',   '1999/03/12',  N'Bắc Giang',  'CNTT1', 'K60', N'Công nghệ thông tin' ),
          ('211212002', N'Hoàng Thị B',  N'Nữ',   '2000/12/10',  N'Hà Nội',     'CNTT2', 'K61', N'Công nghệ thông tin'),
          ('211212003', N'Nguyễn Văn C', N'Nam',  '2003/11/11',  N'Cao Bằng',   'CNTT1', 'K62', N'Công nghệ thông tin'),
          ('211212004', N'Nguyễn Văn D', N'Nam',  '1999/02/07',  N'Thái Bình',  'CNTT1', 'K63', N'Công nghệ thông tin'),
          ('211212005', N'Nguyễn Văn E', N'Nam',  '2003/01/09',  N'Lạng Sơn',   'CNTT4', 'K60', N'Công nghệ thông tin'),
          ('211212006', N'Hoàng Thị F',  N'Nữ',   '2004/01/12',  N'Hà Giang',   'CNTT5', 'K61', N'Công nghệ thông tin'),
          ('211212007', N'Hoàng Thị G',  N'Nữ',   '2005/09/07',  N'Bắc Giang',  'CNTT6', 'K62', N'Công nghệ thông tin'),
          ('211212008', N'Nguyễn Văn H', N'Nam',  '2003/06/12',  N'Hải Dương',  'CNTT3', 'K63', N'Công nghệ thông tin'),
          ('211212009', N'Nguyễn Văn K', N'Nam',  '2000/10/30',  N'Nghệ An',    'CNTT2', 'K60', N'Công nghệ thông tin'),
          ('211212010', N'Nguyễn Văn M', N'Nam',  '1999/12/28',  N'Hà Tĩnh',    'CNTT1', 'K61' ,N'Công nghệ thông tin'),
          ('211212011', N'Nguyễn Văn N', N'Nam',  '1998/09/10',  N'Lào Cai',    'CNTT1', 'K62', N'Công nghệ thông tin'),
          ('211212012', N'Nguyễn Thị E', N'Nữ',   '2004/11/22',  N'Điện Biên',  'CNTT4', 'K63', N'Công nghệ thông tin'),
          ('211212013', N'Hoàng Văn S',  N'Nam',  '2005/02/20',  N'Thanh Hoá',  'CNTT6', 'K60', N'Công nghệ thông tin'),
          ('211212014', N'Nguyễn Văn Q', N'Nam',  '1999/12/19',  N'Hà Nội',     'CNTT1', 'K61', N'Công nghệ thông tin'),
          ('211212015', N'Hoàng Thị V',  N'Nữ',   '2000/05/03',  N'Bắc Giang',  'CNTT5', 'K62', N'Công nghệ thông tin'),
          ('211212016', N'Hoàng Văn L',  N'Nam',  '2000/12/21',  N'Hà Nội',     'CNTT3', 'K63', N'Công nghệ thông tin'),
          ('211212017', N'Nguyễn Văn Z', N'Nam',  '2004/10/02',  N'Cao Bằng',   'CNTT4', 'K60', N'Công nghệ thông tin'),
          ('211212018', N'Hoàng Thị W',  N'Nữ',   '2002/07/19',  N'Bắc Cạn',    'CNTT3', 'K61', N'Công nghệ thông tin'),
          ('211212019', N'Nguyễn Văn Y', N'Nam',  '2004/01/19',  N'Thái Nguyên','CNTT1', 'K62', N'Công nghệ thông tin'),
          ('211212020', N'Nguyễn Thị K', N'Nữ',   '2004/02/01',  N'Bắc Giang',   'CNTT2', 'K63', N'Công nghệ thông tin');
			select * from student;
   
   
   insert into points
 values  ('211212001','2021-2022',8), 
   ('211212002', '2021-2022',7),
   ('211212003', '2021-2022',8.8),
   ('211212004', '2021-2022',8.1),
   ('211212005', '2021-2022',7.8),
   ('211212006', '2021-2022',7.3),
   ('211212007', '2021-2022',8.4),
   ('211212008', '2021-2022',8.7),
   ('211212009', '2021-2022',8),
   ('211212010', '2021-2022',5.9),
   ('211212011', '2021-2022',6),
   ('211212012', '2021-2022',9.1),
   ('211212013', '2021-2022',8.6),
   ('211212014', '2021-2022',7),
   ('211212015', '2021-2022',9),
   ('211212016', '2021-2022',8),
   ('211212017', '2021-2022', 6.9),
   ('211212018', '2021-2022',7.5),
   ('211212019', '2021-2022',8.2),
   ('211212020', '2021-2022',8);
		select *from points;
insert into points_detail
values ('211212001','2021-2022',  N'Cơ sở dữ liệu', 8, 3),
	    ('211212002','2021-2022', N'Công nghệ java', 9, 3),
        ('211212003','2021-2022',  N'Nguyên lý hệ điều hành', 7,3),
        ('211212004','2021-2022', N'Phân tích thiết kết thuật toán', 9, 2),
        ('211212005','2021-2022', N'Lịch sử đảng', 7, 2),
        ('211212006','2021-2022', N'Cơ sở dữ liệu', 9,3),
        ('211212007','2021-2022', N'Công nghệ java', 8,3),
        ('211212008','2021-2022', N'Nguyên lý hệ điều hành', 9, 3),
        ('211212009','2021-2022', N'Phân tích thiết kế thuật toán', 6, 2),
        ('211212010','2021-2022', N'Lịch sử đảng', 8, 2),
        ('211212011','2021-2022', N'Cơ sở dữ liệu', 5, 3),
        ('211212012','2021-2022', N'Công nghệ java', 6,3),
        ('211212013','2021-2022', N'Nguyên lý hệ điều hành', 8,3),
        ('211212014','2021-2022', N'Phân tích thiết kế thuật toán', 9,2),
        ('211212015','2021-2022', N'Lịch sử đảng', 4,2),
        ('211212016','2021-2022', N'Công nghệ java', 5, 3),
        ('211212017','2021-2022', N'Cơ sở dữ liệu', 7, 3),
        ('211212018','2021-2022', N'Nguyên lý hệ điều hành', 8, 3),
        ('211212019','2021-2022', N'Phân tích thiết kế thuật toán', 5, 2),
        ('211212020','2021-2022', N'Lịch sử đảng', 4, 2);
        
        select * from points_detail;
        
        
