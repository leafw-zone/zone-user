CREATE TABLE `user_info` (
  `user_id` varchar(30) NOT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `account_no` varchar(30) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `wechat_no` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `is_deleted` varchar(2) DEFAULT NULL,
  `create_by` varchar(20) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_by` varchar(20) DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;