-- 商品

create table `product_info` (
  `product_id` varchar(32) not null,
  `product_name` varchar(64) not null comment '商品名字',
  `product_price` int not null comment '商品单价',
  `product_stock` int not null comment '商品库存',
  `category_type` int not null comment '类别编号',
  `product_description` varchar(512) comment '商品描述',
  `product_icon` varchar(128) comment '商品图片',
  `product_status` int not null DEFAULT 0 comment '商品状态0正常，1下架',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`product_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8


-- 商品类别
create table `product_category`(
  `category_id` varchar(32) not null,
  `category_name` varchar(64) not null comment '类别名称',
  `category_type` int not null comment '类别编号',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key (`category_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

-- 订单
create table `order_info`(
  `order_id` varchar(32) not null,
  `buyer_name` varchar(32) not null comment '用户姓名',
  `buyer_phone` varchar(12) not null comment '用户电话',
  `address` varchar(64) not null comment '用户地址',
  `order_status` tinyint(3) not null default '0' comment '订单状态，默认新建',
  `buyer_openid` varchar(32) not null comment '用户openid',
  `pay_status` tinyint(3) not null default '0' comment '默认未支付',
  `order_amount` int not null comment '订单总金额',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key(`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

--订单详情

create table `order_detail`(
  `detail_id` varchar(32) not null,
  `order_id` varchar(32) not null comment '订单id',
  `product_id` varchar(32) not null comment '商品id',
  `product_name` varchar(64) not null comment '商品名字',
  `product_price` int not null comment '商品单价',
  `product_description` varchar(512) comment '商品描述',
  `product_icon` varchar(128) comment '商品图片',
  `product_quantity` int not null comment '商品数量',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key(`detail_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

-- 卖家
create table `seller_info`(
  `seller_id` varchar(32) not null,
  `username` varchar(32) not null comment '商家名字',
  `password` varchar(32) not null comment '密码',
  `openid` varchar(64) not null comment '微信openid',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
  primary key(`seller_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8