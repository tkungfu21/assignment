<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/cart.css">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://use.fontawesome.com/c560c025cf.js"></script>
        <div class="container">
            <div class="card shopping-cart">
                <div class="card-header bg-dark text-light">
                    <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                    Manager
                    <a href="" class="btn btn-outline-info btn-sm pull-right">home</a>
                    <div class="clearfix"></div>
                </div>
                <div class="card-body">
                    <!-- PRODUCT -->
                    <c:forEach items="${listP}" var="o">
                        <div class="row">
                            <div class="col-12 col-sm-12 col-md-2 text-center">
                                <img class="img-responsive" src="${o.img}" alt="prewiew" width="120" height="80">
                            </div>
                            <div class="col-12 text-sm-center col-sm-12 text-md-left col-md-6">
                                <h4 class="product-name"><strong>${o.name}</strong></h4>
                            </div>
                            <div class="col-12 col-sm-12 text-sm-center col-md-4 text-md-right row">
                                <div class="col-3 col-sm-3 col-md-6 text-md-right" style="padding-top: 5px">
                                    <h6><strong>${o.price}</strong></h6>
                                </div>
                                <form>
                                    <div class="col-2 col-sm-2 col-md-2 text-right">
                                        <button type="button" class="btn btn-outline-danger btn-xs">
                                            <i class="fa fa-trash" aria-hidden="true"></i>
                                        </button>
                                    </div>
                                </form>
                                <form><div class="col-2 col-sm-2 col-md-2 text-right">
                                        <button type="button" class="btn btn-outline-danger btn-xs">
                                            update
                                        </button>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </c:forEach>
                    <hr>
                    <!-- END PRODUCT -->
                    <div class="pull-right">
                        <a href="" class="btn btn-outline-secondary pull-right">
                            add product 
                        </a>
                    </div>
                </div>
                <div class="card-footer">
                    <div class="coupon col-md-5 col-sm-5 no-padding-left pull-left">
                        <div class="row">
                            <div class="col-6">
                                <input type="text" class="form-control" placeholder="name">
                            </div>
                            <div class="col-6">
                                <input type="submit" class="btn btn-default" value="Search">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
