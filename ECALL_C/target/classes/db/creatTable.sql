CREATE TABLE `srboard` (
   `IDX` BIGINT(20) NOT NULL AUTO_INCREMENT,
   `REGDATE` DATE NOT NULL DEFAULT sysdate(),
   `SRSEQUENCE` INT(11) NOT NULL COMMENT '0.전체\r\n1.온라인\r\n2.전자우편\r\n3.전화\r\n4.공문\r\n5.업무협의',
   `DEPARTMENT` VARCHAR(100) NOT NULL DEFAULT '' COLLATE 'latin1_swedish_ci',
   `PATH` INT(11) NOT NULL COMMENT '1.접수 전\r\n2.처리중\r\n3.처리완료\r\n4.협의필요',
   `WRITER` VARCHAR(100) NOT NULL COLLATE 'latin1_swedish_ci',
   `PHONE` VARCHAR(100) NOT NULL COLLATE 'latin1_swedish_ci',
   `SUBJECT` VARCHAR(300) NOT NULL COLLATE 'latin1_swedish_ci',
   `FILDWORKER` VARCHAR(100) NOT NULL DEFAULT '' COLLATE 'latin1_swedish_ci',
   `CONTENT` VARCHAR(1000) NOT NULL COLLATE 'latin1_swedish_ci',
   `RESULT` VARCHAR(1000) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
   `REQUSET` INT(11) NOT NULL COMMENT '1.사용문의\r\n2.데이터처리\r\n3.운영지원\r\n4.장애\r\n5.단순변경\r\n6.하자보수\r\n7.보완개발\r\n8.확대개발\r\n9.적응유지보수\r\n10.기타\r\n11.미분류\r\n',
   `EXENDDATE` DATE NOT NULL DEFAULT sysdate(),
   `ENDDATE` DATE NULL DEFAULT NULL,
   `SPENDTIME` VARCHAR(100) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
   PRIMARY KEY (`IDX`) USING BTREE
)