/*
	SQL(Structured Query Language) : 데이터베이스에서 사용하는 데이터 처리 언어
		1. DDL( Data Definition Language ) 정의어			: 되돌리기(rollback) 불가능.
			1. create	: 데이터베이스/테이블 생성 
				1. 데이터베이스 생성 
					create database 데이터베이스명;
				2. 테이블 생성 
					create table 테이블명( 필드명 타입 제약조건 , 필드명 타입 제약조건 , 관계제약조건 );
            2. drop		: 데이터베이스/테이블 삭제
				1. 테이터베이스 삭제
					drop database if exists 데이터베이스명;
                2. 테이블 삭제 
					drop table if exists 테이블명;
                    
			3. use		: 사용할 데이터베이스 선택
				- use 데이터베이스명;
			4. truncate : 데이터 삭제
                
        2. DML( Data Manipulation Language  ) 조작어*		: 되돌리기(rollback) 가능.
			1.[C] insert 	: 레코드 삽입 
				1. 모든 레코드 삽입
					- insert into 테이블명 values( 값1 , 값2 , 값3 );
                2. 특정 레코드 삽입
					- insert into 테이블명( 필드명1 , 필드명2 , 필드명3 ) values( 값1 , 값2 , 값3 );
            2.[R] select	: 레코드 검색 
				1. 모든 필드(*) 를 표시한 레코드 검색
					- select * from 테이블명;
                2. 특정 필드를 표시한 레코드 검색
					- select 필드명1 , 필드명2 from 테이블명;
            3.[U] update	: 레코드 필드의 값 수정 
				1. 모든 레코드의 필드 값을 수정
					- update 테이블명 set 수정할필드명 = 새로운값 , 수정할필드명 = 새로운값;
                2. 특정(조건에 충족하는) 레코드의 필드 값을 수정
					- update 테이블명 set 수정할필드명 = 새로운값 , 수정할필드명 = 새로운값 where 조건식;
            4.[D] delete	: 레코드 삭제
				1. 모든 레코드 삭제 
					- delete from 테이블명;
				2. 특정(조건에 충족하는) 레코드 삭제 
					- delete from 테이블명 where 조건식;
		- 제약 조건 
			1. not null
            2. unique
            3. default 값
            4. primary key( pk필드명 )
            5. foreign key( fk필드명 ) references 참조할테이블명( 참조할pk필드명 )
            
		- where : 조건절
*/

# -- 초기화

# 1. 데이터베이스 생성 
drop database if exists test5;
create database test5;
use test5; #1. DB서버[서버PC]내 여러개의 데이터베이스가 존재하기 때문에 db선택해야한다.

# 2. 테이블 생성 
drop table if exists table1;
create table table1( 데이터필드1 int , 데이터필드2 varchar(30) );

# 3. 조작어.
# [C] insert 
	# 1. 모든 필드의 값 대입시 필드명 생략 
insert into table1 values( 1 , '유재석');
# java 작성시 : "insert into table1 values( 1 , '유재석') ";

	# 2. 특정 필드의 값 대입시 특정 필드명 작성 
insert into table1( 데이터필드1 ) values( 5 );		# 생략된 필드명의 값의 기본값은 null

# [R] select 
	# 1. 모든 필드[*] 를 표시하는 레코드 검색
select * from table1;
	# 2. 특정 필드를 표시하는 레코드 검색
select 데이터필드2 from table1;

# [U] update 
	# 1. 모든 레코드의 필드 값을 수정
update table1 set 데이터필드2 = '강호동';
	# 2. 특정(조건에 충족하는) 레코드의 필드 값을 수정
update table1 set 데이터필드2 = '강호동' where 데이터필드1 = 5;  #(조건식:만약에 데이터필드1 값이 5 인 레코드만 수정);

# [D] delete
	# 1. 모든 레코드 삭제 					/ 추후에 취소 가능 / 특정(where)
delete from table1 ;
	# 2. 특정(조건에 충족하는) 레코드 삭제 
delete from table1 where 데이터필드1 = 5 ; #(조건식:만약에 데이터필드1 값이 5 인 레코드만 삭제 );

	# vs
    
	# 1. 테이블의 데이터 모두 삭제 / 추후에 취소 불가능
truncate table table1;


use test5;
drop table if exists members;
create table members(
	name varchar(30)
);

# 1. 
insert into members values('유재석'); 

# 2.
select * from members;

# 3. 만약에 이름이 강호동이면 신동엽으로 변경.
update members set name = '신동엽' where name = '강호동'; 

# 4.
delete from members where name = '신동엽' ;

















