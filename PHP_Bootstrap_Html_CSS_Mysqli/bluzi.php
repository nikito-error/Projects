<?php include "./header.php" ?>
<section class="white-section" id="categories">
    <div class="headin-catalog">
        <h3>Блузи</h3>
    </div>

    <!-- <nav class="navbar navbar-expand-lg navbar-light mb-2 mt-3 filters "> -->
    <div class="row filters mb-2 mt-3 ">
        <div class="dropdown dropdown-butt ">
            <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Размери
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">XS</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">S</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">M</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">L</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">XL</label><br>
            </div>
        </div>
        <div class="dropdown dropdown-butt">
            <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Цена
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <input type="text" id="coding" name="interest" placeholder="От">
                <label for="coding">-</label><br>
                <input type="text" id="coding" name="interest" placeholder="До">
            </div>
        </div>
        <div class="dropdown dropdown-butt ">
            <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Цветове
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">Бял</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">Черен</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">Син</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">Червен</label><br>
                <input type="checkbox" id="coding" name="interest" value="coding">
                <label for="coding">Сив</label><br>
            </div>
        </div>
        </div>
    <!-- </nav> -->


    <div class="row">

        <div class="pricing-column-categ col-lg-3 col-md-6 col-6">
            <div class="card ">
                <div class="card-header ">
                    <img class="img-fluid rounded" src="images\bluza1.jpg" alt="Second slide">
                </div>
                <div class="card-body">
                    <p>Памучна блуза</p>
                    <h2 class="price-text">23.50 лв.</h2>

                </div>
            </div>
        </div>

        <div class="pricing-column-categ col-lg-3 col-md-6 col-6">
            <div class="card">
                <div class="card-header">
                    <img class=" img-fluid rounded" src="images\bluza2.jpg" alt="Second slide">
                </div>
                <div class="card-body">
                    <p>Блуза България</p>
                    <h2 class="price-text">29.00 лв.</h2>
                </div>
            </div>
        </div>

        <div class="pricing-column-categ col-lg-3 col-6">
            <div class="card">
                <div class="card-header">
                    <img class=" img-fluid rounded" src="images\bluza3.jpg" alt="Second slide">
                </div>
                <div class="card-body">
                    <p>Ежедневна блуза</p>
                    <h2 class="price-text">22.00 лв.</h2>
                </div>
            </div>
        </div>
        <div class="pricing-column-categ col-lg-3 col-6">
            <div class="card">
                <div class="card-header">
                    <img class=" img-fluid rounded" src="images\bluzi3.jpeg" alt="Second slide">
                </div>
                <div class="card-body">
                    <p>Спортна блуза</p>
                    <h2 class="price-text">20.50 лв.</h2>
                </div>
            </div>
        </div>

    </div>
</section>
<?php include "./footer.php" ?>
