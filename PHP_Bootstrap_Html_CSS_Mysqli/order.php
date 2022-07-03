<?php include "./header.php" ?>
<section class="white-section" id="categories">

    <div class="row">
        <div class="pricing-column col-lg-6 col-md-6">
            <h2 class="mb-3">Детайли за доставка</h2>
            <form>
                <div class="form-group mb-3">
                    <label for="exampleInputEmail1">Име</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="">

                </div>
                <div class="form-group mb-3 ">
                    <label for="exampleInputPassword1">Фамилия</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="">
                </div>
                <div class="form-group mb-3 ">
                    <label for="exampleInputPassword1">Имейл</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="">
                </div>
                <div class="form-check mb-3">
                    <div class="row" >
                        <div class="col-6" style="text-align: left;">
                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                            <label class="form-check-label" for="exampleRadios1">
                                Офис на куриер
                            </label>
                        </div>
                        <div class="col-6" style="text-align: right;">
                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                            <label class="form-check-label" for="exampleRadios1">
                                До адрес
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group mb-3 ">
                    <label for="exampleInputPassword1">Адрес</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="">
                </div>
                <div class="form-group mb-3 ">
                    <label for="exampleInputPassword1">Град</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="">
                </div>

            </form>
        </div>

        <div class="pricing-column col-lg-6 col-md-6" style="padding:8%;">
            <form action="success.php" >
                <div class="row">
                    <div class="form-group mb-3 col-6">
                        <p >Цена:</p>
                        <p >Доставка: </p>
                        <p >Общо: </p>
                    </div>
                    <div class="form-group mb-3 col-6" style="text-align: right;">
                        <p >46.50 лв.</p>
                        <p >5.00 лв. </p>
                        <p >51.50 лв. </p>
                    </div>
                </div>
                <div class="form-check mb-3">
                    <div class="row" >
                        <div class="col-6" style="text-align: left;">
                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
                            <label class="form-check-label" for="exampleRadios1">
                                В брой
                            </label>
                        </div>
                        <div class="col-6" style="text-align: right;">
                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" >
                            <label class="form-check-label" for="exampleRadios1">
                                С карта
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group mb-3 ">
                    <div class="row" >
                        <div class="col-6">
                    <label for="exampleInputPassword1">Код за отстъпка</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="">
                    </div>
                        <div class="col-6">
                            <br><button type="submit" class="btn btn-dark btn-block" style="margin: 4% 0%;" >Приложи</button>
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-dark btn-block" style="margin: 5% 0%;" >Поръчай</button>


            </form>
        </div> </div>
</section>
<?php include "./footer.php" ?>