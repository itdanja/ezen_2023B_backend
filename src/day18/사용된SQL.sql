# DAY18 회원가입 게시판
# 1. 데이터베이스 생성 
drop database if exists java;
create database java;
use java;
# 2. (회원가입) 테이블 
drop table if exists member;
create table member(
	mno	int auto_increment,					-- 번호. 자동번호 부여(auto_increment) pk만 가능.
    mid	varchar(30) not null unique,		-- 아이디.
    mpw	varchar(30) not null ,				-- 비밀번호.
    mphone char(13) not null unique,		-- 전화번호 010-0000-0000 형식.
    mdate datetime 	default	now(),			-- 가입날짜.
    primary key( mno )						-- 번호가 기본키(pk) - not null , unique 생략 가능.
); 
# 3. 확인용
select * from member;

# 1. C(insert) 회원가입 
	# insert into member( 필드명 , 필드명 , 필드명 )values( 값1 , 값2 , 값3 );
insert into member( mid , mpw , mphone ) values( 'qweqweqwe' , 'qweqweqwe' , '010-0000-0000');
	# java 
# insert into member( mid , mpw , mphone ) values( ? , ? , ? );

# 2. R(select) 아이디 중복체크/검사/비교
	# select * from member;
select * from member;
	# select mid from member;
select mid from member;
	# select mid from member where mid = '찾을아이디'; ( where 조건식 : 필드명 = 값 )
select mid from member where mid = 'qweqweqwe';
# select mid from member where mid = ?;
# select mid from member where mid = '"+변수+"'";

# 3. R(select) 로그인 : 아이디와 비밀번호 비교  and( java && , db and  ) , or( java || , db or ) 
select * from member where mid = 'qweqweqwe' and mpw = '123123';
# select * from member where mid = ? and mpw = ?;

# 4. R(select) 회원번호 찾기  : 아이디에 해당하는 회원번호 출력 
select mno from member where mid = 'qweqweqwe';
# select mno from member where mid = ? ;







