DROP TABLE IF EXISTS `biz_invest_info` ;

CREATE TABLE `biz_invest_info` (
                                   `id` bigint(20) NOT NULL DEFAULT '0',
                                   `uid` char(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户第三方主键',
                                   `uType` int(10) NOT NULL DEFAULT '0' COMMENT '用户第三方类型',
                                   `userName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名称',
                                   `userTel` bigint(20) DEFAULT NULL COMMENT '用户电话',
                                   `userGender` int(10) DEFAULT NULL COMMENT '用户性别',
                                   `placeName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '小区名称',
                                   `placeAddress` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '小区地址',
                                   `area` int(10) NOT NULL DEFAULT '0' COMMENT '产权面积',
                                   `addArea` int(10) NOT NULL DEFAULT '0' COMMENT '搭建面积',
                                   `remodelingYear` int(10) NOT NULL DEFAULT '0' COMMENT '装修年限',
                                   `houseStyle` int(10) DEFAULT NULL COMMENT '装修风格',
                                   `hallFloor` int(10) DEFAULT NULL COMMENT '客厅地面',
                                   `houseSystem` int(10) DEFAULT NULL COMMENT '全屋系统',
                                   `caseID` bigint(20) NOT NULL DEFAULT '0' COMMENT '关联案件',
                                   `caseTimes` int(11) NOT NULL DEFAULT '0' COMMENT '关联次数',
                                   `caseStatus` smallint(4) NOT NULL DEFAULT '0' COMMENT '关联状态',
                                   `ctime` datetime DEFAULT NULL COMMENT '创建时间',
                                   `mtime` datetime DEFAULT NULL COMMENT '更新时间',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
