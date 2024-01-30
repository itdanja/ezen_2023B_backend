# 1. 데이터베이스 생성
drop database if exists test6;
create database test6;
use test6; 

# 2. 테이블 생성 
	# 회원제기능. 카테고리게시물기능. 댓글기능.
    # 1. 저장할 데이터들을 선정.
    # 2. 관심사 끼리 묶어서 데이터들을 테이블 설계
    # 3. 관계 설계 ( PK , FK )		* 테이블당 PK필드 1개 이상 권장.
		# PK : (식별키/기본키) : 식별가능한 데이터 , 중복없고(unique) + NOT NULL(not null) => primary key
			# 1.auto_increment DB자동번호 , 2.직접 정의한다.
		# FK : (외래키) 		: PK필드와 연결된 필드
			# 중복 가능. NULL 가능
		    
	# 4. 제약 조건 
		# 모든 테이블에는 primary key 사용한다.
        # foreign key 작성하는 테이블은 (1:M) M테이블에 작성한다.
        
	# 5. 관계 테이블 생성/삭제 실행 순서.
		# 생성시 : create 상위 테이블 먼저 생성 
        # 삭제시 : drop 하위 테이블 먼저 삭제
        
/*
	제약조건 
		1. not null 
        2. unique
        3. default 값/함수()
        4. primary key( pk필드명 )
        5. foreign key( fk필드명 ) references 참조할테이블명( 참조할pk필드명) 
        6. ( mysql ) auto_increment
			* pk일때만 가능.
*/
drop table if exists member;
create table member(
	mno int auto_increment , 	
    mid varchar(10) ,
    mpw varchar(10) ,
    primary key( mno )
);
drop table if exists bcategory;
create table bcategory(
	bcno int auto_increment ,
    bcname varchar(10) , 
	primary key( bcno )
);
drop table if exists board;
create table board(
	bno int auto_increment ,
    btitle text ,
    bcontent  text ,
    
    mno_fk int , 
    bcno_fk int , 
    
    primary key( bno ) , 
    foreign key( mno_fk ) references member( mno )  , 		 -- 회원테이블 과 참조.
    foreign key( bcno_fk ) references bcategory( bcno )   	 --  카테고리 테이블과 참조.
    
);
drop table if exists reply;
create table reply(
	rno int auto_increment , 
    rcontent text ,
    
    bno_fk int ,
    
    primary key( rno ) ,
    foreign key( bno_fk ) references board( bno )    		-- 게시물 테이블과 참조.
    
);
















    
    
    