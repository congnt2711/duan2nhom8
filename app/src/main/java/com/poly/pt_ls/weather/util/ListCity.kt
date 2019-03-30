package com.poly.pt_ls.weather.util

import com.poly.pt_ls.weather.R
import com.poly.pt_ls.weather.model.City

fun getListCity() = listOf(
    City("An Giang", R.drawable.angiang, 10.571638,104.6149443),
    City("Bà Rịa-Vũng Tàu", R.drawable.baria,9.7181719,106.499078 ),
    City("Bạc Liêu", R.drawable.baclieu, 9.3265976,105.2657506),
    City("Bắc Kạn", R.drawable.backan, 22.2727717,105.5586281),
    City("Bắc Giang", R.drawable.bacgiang, 21.3746669,106.1766778),
    City("Bắc Ninh", R.drawable.bacninh, 21.1169292,105.9594156),
    City("Bến Tre", R.drawable.bentre, 10.0653966,106.2812922),
    City("Bình Dương", R.drawable.binhduong, 11.1827264,106.3708028),
    City("Bình Định", R.drawable.binhdinh, 14.104002,108.4192085),
    City("Bình Phước", R.drawable.binhphuoc, 11.800006,106.6387334),
    City("Bình Thuận", R.drawable.binhthuan, 11.0147777,107.9242488),
    City("Cà Mau", R.drawable.camau, 9.1755273,105.1171315),
    City("Cao Bằng", R.drawable.caobang,22.7391596,105.7723437),
    City("Cần Thơ", R.drawable.cantho, 10.0342696,105.7225509),
    City("Đà Nẵng", R.drawable.danang, 16.0472484,108.1716866),
    City("Đắk Lắk", R.drawable.daklak, 12.7886874,107.6793468),
    City("Đắk Nông", R.drawable.daknong, 12.280628,107.3805534),
    City("Điện Biên", R.drawable.dienbien, 21.7212907,102.3111512),
    City("Đồng Nai", R.drawable.dongnai, 11.0524002,106.8842038),
    City("Đồng Tháp", R.drawable.dongthap, 10.5553442,105.2843188),
    City("Gia Lai", R.drawable.gialai, 13.800288,107.6009308),
    City("Hà Giang", R.drawable.hagiang, 22.7794409,104.4026569),
    City("Hà Nam", R.drawable.hanam, 20.5340648,105.836108),
    City("Hà Nội", R.drawable.hanoi, 21.0227788,105.8194541),
    City("Hà Tĩnh", R.drawable.hatinh, 18.3607329,105.5237598),
    City("Hải Dương", R.drawable.haiduong, 20.9409087,106.2894089),
    City("Hải Phòng", R.drawable.haiphong, 20.8468135,106.6637272),
    City("Hòa Bình", R.drawable.hoabinh, 20.7095132,105.0661777),
    City("Hồ Chí Minh", R.drawable.hcm, 20.7103447,105.0661763),
    City("Hậu Giang", R.drawable.haugiang, 9.7888781,105.4720167),
    City("Hưng Yên", R.drawable.hungyen, 20.8103821,105.9406755),
    City("Khánh Hòa", R.drawable.khanhhoa, 12.3192431,108.7889984),
    City("Kiên Giang", R.drawable.kiengiang, 9.8982395,103.9382661),
    City("Kon Tum", R.drawable.kontum, 14.3430236,107.8994299),
    City("Lai Châu", R.drawable.laichau, 22.2519759,102.8713635),
    City("Lào Cai", R.drawable.laocai, 22.3603925,103.7993515),
    City("Lạng Sơn", R.drawable.langson, 21.8557098,106.676965),
    City("Lâm Đồng", R.drawable.lamdong, 11.765814,107.7176449),
    City("Long An", R.drawable.longan, 10.7122481,105.8450582),
    City("Nam Định", R.drawable.namdinh, 20.2060119,105.9760971),
    City("Nghệ An", R.drawable.nghean, 19.2747445,104.2800264),
    City("Ninh Bình", R.drawable.ninhbinh, 20.1876032,105.7150625),
    City("Ninh Thuận", R.drawable.ninhthuan, 11.7385979,108.6119283),
    City("Phú Thọ", R.drawable.phutho, 21.3186182,104.8550364),
    City("Phú Yên", R.drawable.phuyen, 13.2017752,108.7849639),
    City("Quảng Bình", R.drawable.quangbinh, 17.5056134,106.0221452),
    City("Quảng Nam", R.drawable.quangnam, 15.5097033,107.6942819),
    City("Quảng Ngãi", R.drawable.quangngai, 14.9963111,108.3790437),
    City("Quảng Ninh", R.drawable.quangninh, 21.1520724,106.9935048),
    City("Quảng Trị", R.drawable.quangtri, 16.7356687,106.6722455),
    City("Sóc Trăng", R.drawable.soctrang,9.5912297,105.6461192),
    City("Sơn La", R.drawable.sonla, 21.3022049,103.5581658),
    City("Tây Ninh", R.drawable.tayninh, 11.3659451,106.0946341),
    City("Thái Bình", R.drawable.thaibinh, 20.5022619,106.2301171),
    City("Thái Nguyên", R.drawable.thainguyen, 21.6871729,105.5770854),
    City("Thanh Hóa", R.drawable.thanhhoa, 19.9786188,104.664552),
    City("Thừa Thiên - Huế", R.drawable.hue,16.4534699,107.5420937),
    City("Tiền Giang", R.drawable.tiengiang, 10.3887585,106.0303652),
    City("Trà Vinh", R.drawable.travinh, 9.8055855,106.1259042),
    City("Tuyên Quang", R.drawable.tuyenquang, 22.0975109,104.6626367),
    City("Vĩnh Long", R.drawable.vinhlong, 10.107553,105.8461027),
    City("Vĩnh Phúc", R.drawable.vinhphuc, 21.3632666,105.4181726),
    City("Yên Bái", R.drawable.yenbai, 21.8092398,104.2127774)
)