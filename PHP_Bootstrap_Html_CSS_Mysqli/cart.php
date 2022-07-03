<?php include "./header.php" ?>
<div class="row " style="padding: 1% 8% 1% 4%;">
    <div class="col-lg-6 cart-heading">
        <h2>Моята количка</h2>
        <div class="row" style="padding-top: 3%;">
            <div class="col-3"><img class=" img-thumbnail cart-size" src="images/rozovaB.png" alt=""></div> 
            <div class="col-5" style="line-height: 1;">
               
               <p> Блуза</p>
             <p> 24.00 лв.</p>
              <p>Цвят: розов</p>
               <p>Размер: М</p>
              <i class="fas fa-minus-circle" style="font-size:22px;"></i>
             &nbsp 1 &nbsp
               <i class="fas fa-plus-circle" style="font-size:22px;"></i> 
                
            </div>
            <div class="col-4" style="text-align:right;">
                <i class="fas fa-trash-alt" style="font-size: 22px;"></i>
            </div>
        </div>
        
        <div class="row" style="padding-top: 3%;">
            <div class="col-3"><img class=" img-thumbnail cart-size" src="images/dunki1.jpg" alt=""></div> 
            <div class="col-5" style="line-height: 1;">
               
               <p> Дънки със скъсан ефект</p>
             <p> 22.50 лв.</p>
              <p>Цвят: син</p>
               <p>Размер: L</p>
              <i class="fas fa-minus-circle" style="font-size:22px;"></i>
             &nbsp 1 &nbsp
               <i class="fas fa-plus-circle" style="font-size:22px;"></i> 
                
            </div>
            <div class="col-4" style="text-align:right;">
                <i class="fas fa-trash-alt" style="font-size: 22px;"></i>
            </div>
        </div>
        
    </div>
     <div class="col-lg-6 cart-heading rounded" style=" background-color: #efefef; padding:7%;">
         <form action="order.php" >
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

                <button type="submit" class="btn btn-dark btn-block" style="margin: 5% 0%;" >Поръчай</button>


            </form>
    </div>
</div>
<?php include "./footer.php" ?>
