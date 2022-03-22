

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="css/manager.css">
    <body>
        <div class="container">
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-xs-6">
                                <h2>Manager <b>(Edit)</b></h2>
                            </div>
                            <div class="col-xs-6">
                                
                                <a href="manager" class="btn btn-danger" ><i class="material-icons">&#xE15C;</i> <span>Back to manager</span></a>						
                            </div>
                        </div>
                    </div>
                    <div id="editEmployeeModal">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <form action="edit" method="post">
                                    <div class="modal-header">						
                                        <h4 class="modal-title">Edit</h4>
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    </div>
                                    <div class="modal-body">					
                                        <div class="form-group">
                                            <label>ID</label>
                                            <input value="${k.getId()}" name="id" type="text" class="form-control" readonly required>
                                        </div>
                                        <div class="form-group">
                                            <label>Name</label>
                                            <input value="${k.getName()}" name="name" type="text" class="form-control" required>
                                        </div>
                                        <div class="form-group">
                                            <label>Image</label>
                                            <input value="${k.getImg()}" name="image" type="text" class="form-control" required>
                                        </div>
                                        <div class="form-group">
                                            <label>Price</label>
                                            <input value="${k.getPrice()}" name="price" type="text" class="form-control" required>
                                        </div>
                                        <div class="form-group">
                                            <label>Title</label>
                                            <textarea name="title" class="form-control" required>${k.getTitle()}</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>Description</label>
                                            <textarea name="description" class="form-control" required>${k.getDescription()}</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>Category</label>
                                            <select name="category" class="form-select" aria-label="Default select example">
                                                <c:forEach items="${listC}" var="o">
                                                    <option value="${o.getcID()}">${o.getcName()}</option>
                                                </c:forEach>
                                            </select>
                                        </div>

                                    </div>
                                    <div class="modal-footer">
                                        <input type="submit" class="btn btn-success" value="Edit">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>


                <script src="js/manager.js" type="text/javascript"></script>
                </body>
                </html>