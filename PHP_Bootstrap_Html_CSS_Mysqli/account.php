<?php include "./database.php" ?>
<?php include "./login.php" ?>
<?php include "./header.php" ?>
<section class="white-section" id="categories">

    <div class="row">
        <div class="pricing-column col-lg-6 col-md-6">
            <h2 class="mb-3">Вече сте потребител?</h2>
            <form method="post">
                <div class="form-group mb-3">
                    <label for="exampleInputEmail1">Имейл</label>
                    <input type="email" name="email1" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">Няма да споделим вашия имейл с никого.</small>
                </div>
                <div class="form-group mb-5 ">
                    <label for="exampleInputPassword1">Парола</label>
                    <input type="password" name="password1" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>


                <button type="submit" name="login" class="btn btn-outline-dark btn-block">Вход</button>


            </form>
        </div>

        <div class="pricing-column col-lg-6 col-md-6">
           <h2 class="mb-3">Регистрация</h2>
            <form method="post">
                <div class="form-group mb-3">
                    <label for="exampleInputEmail1">Имейл</label>
                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">Няма да споделим вашия имейл с никого.</small>
                </div>
                  <div class="form-group mb-5 ">
                    <label for="exampleInputPassword1">Име</label>
                    <input type="text" name="firstName" class="form-control" id="exampleInputPassword1" placeholder="Name">
                </div>
                  <div class="form-group mb-5 ">
                    <label for="exampleInputPassword1">Фамилия</label>
                    <input type="text" name="lastName" class="form-control" id="exampleInputPassword1" placeholder="Family">
                </div>
                <div class="form-group mb-5 ">
                    <label for="exampleInputPassword1">Парола</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>


                <button type="submit" name="submit" class="btn btn-outline-dark btn-block mb-3">Регистрация</button>
                <label for="exampleInputPassword1">Приемам правилата и условията на електронния магазин и политиката за поверителност.</label>


            </form>
        </div> </div>
</section>
<?php include "./footer.php" ?>
