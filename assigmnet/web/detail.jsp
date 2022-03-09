<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>lion</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <title>eCommerce Product Detail</title>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
        <link href="./css/detail.css" rel="stylesheet">


    </head>

    <body>
        <div id="content">
            <!-- header -->
            <header>
                <!-- header inner -->
                <div class="head_top">
                    <div class="header">

                        <div class="container-fluid">

                            <div class="row">
                                <div class="col-lg-3 logo_section">
                                    <div class="full">
                                        <div class="center-desk">
                                            <div class="logo">
                                                <a href="home.jsp"><img src="images/logo.png" alt="#"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-9">
                                    <div class="right_header_info">
                                        <ul>
                                            <li class="menu_iconb">
                                                <a href="#"><img style="margin-right: 15px;" src="icon/1.png" alt="#" />7213456789</a>
                                            </li>
                                            <li class="menu_iconb">
                                                <a href="#">Log in <img style="margin-right: 15px;" src="icon/5.png" alt="#" /> </a>
                                            </li>
                                            <li class="menu_iconb">
                                                <a href="#">Signup<img style="margin-left: 15px;" src="icon/6.png" alt="#" /></a>
                                            </li>
                                            <li class="tytyu">
                                                <a href="#"> <img style="margin-right: 15px;" src="icon/2.png" alt="#" /></a>
                                            </li>
                                            <li class="menu_iconb">
                                                <a href="#"><img style="margin-right: 15px;" src="icon/3.png" alt="#" /></a>
                                            </li>

                                            <li>
                                                <button type="button" id="sidebarCollapse">
                                                    <img src="images/menu_icon.png" alt="#" />
                                                </button>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="card">
                        <div class="container-fliud">
                            <div class="wrapper row">
                                <div class="preview col-md-6">

                                    <div class="preview-pic tab-content">
                                        <div class="tab-pane active" id="pic-1"><img src="${p.img}" /></div>
                                    </div>

                                </div>
                                <div class="details col-md-6">
                                    <h3 class="product-title">${p.name}</h3>
                                    <div class="rating">
                                        <div class="stars">
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star checked"></span>
                                            <span class="fa fa-star"></span>
                                            <span class="fa fa-star"></span>
                                        </div>
                                        <span class="review-no">41 reviews</span>
                                    </div>
                                    <p class="product-description">lion shop noi ban tin tuong, chuyen ban hang chinh hang</p>
                                    <h4 class="price">current price: <span>${p.price}</span></h4>
                                    <p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87 votes)</strong></p>
                                    <h5 class="sizes">sizes:
                                        <span class="size" data-toggle="tooltip" title="small">s</span>
                                        <span class="size" data-toggle="tooltip" title="medium">m</span>
                                        <span class="size" data-toggle="tooltip" title="large">l</span>
                                        <span class="size" data-toggle="tooltip" title="xtra large">xl</span>
                                    </h5>
                                    <h5 class="colors">colors:
                                        <span class="color orange not-available" data-toggle="tooltip" title="Not In store"></span>
                                        <span class="color green"></span>
                                        <span class="color blue"></span>
                                    </h5>
                                    <div class="action">
                                        <button class="add-to-cart btn btn-default" type="button">add to cart</button>
                                        <button class="add-to-cart btn btn-default" type="button">buy now</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <footer>
                    <div class="footer" style="margin-top: 60px">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="footer_top">
                                        <div class="row">
                                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                                <a href="index.html"> <img class="logo1" src="images/logo1.png" /></a>
                                            </div>
                                            <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                                <ul class="sociel">
                                                    <li> <a href="#"><i class="fa fa-facebook-f"></i></a></li>
                                                    <li> <a href="#"><i class="fa fa-twitter"></i></a></li>
                                                    <li> <a href="#"><i class="fa fa-instagram"></i></a></li>
                                                    <li> <a href="#"><i class="fa fa-linkedin"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 ">
                                    <div class="row">
                                        <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6 ">
                                            <div class="address">
                                                <h3>Contact us </h3>
                                                <ul class="loca">
                                                    <li>
                                                        <a href="#"><img src="icon/loc.png" alt="#" /></a>145 londone
                                                        <br>uk </li>
                                                    <li>
                                                        <a href="#"><img src="icon/call.png" alt="#" /></a>+12586954775 </li>
                                                    <li>
                                                        <a href="#"><img src="icon/email.png" alt="#" /></a>demo@gmail.com </li>

                                                </ul>

                                            </div>
                                        </div>
                                        <div class="col-lg-3 col-md-6 col-sm-6">
                                            <div class="address">
                                                <h3>customer service</h3>
                                                <ul class="Menu_footer">
                                                    <li class="active"> <a href="#">My account</a> </li>
                                                    <li><a href="#">Wishlist</a> </li>
                                                    <li><a href="#">My Cart</a> </li>
                                                    <li><a href="#">Checkout</a> </li>
                                                    <li><a href="#">Login</a> </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-lg-3 col-md-6 col-sm-6">
                                            <div class="address">
                                                <h3>corporation</h3>
                                                <ul class="Links_footer">
                                                    <li class="active"><a href="#">My account</a> </li>
                                                    <li><a href="#">Wishlist</a> </li>
                                                    <li><a href="#">My Cart</a> </li>
                                                    <li><a href="#"> Checkout</a> </li>
                                                    <li><a href="#">Login</a> </li>
                                                </ul>
                                            </div>
                                        </div>

                                        <div class="col-lg-3 col-md-6 col-sm-6 ">
                                            <div class="address">
                                                <h3>why choose us</h3>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna </p>
                                                <form class="newtetter">
                                                    <input class="tetter" placeholder="Your email" type="text" name="Your email">
                                                    <button class="submit">Subscribe</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="copyright"> 
                            <div class="container">
                                <p>Copyright 2019 All Right Reserved By <a href="https://html.design/">Free html Templates</a></p>
                            </div>
                        </div>
                    </div>

                </footer>

                </body>
                </html>
