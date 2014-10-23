<?php


//
//questa la eseguo dentro una classe ...passo tutti parametri che vengono da una query nel suo while 
//in pratica ad ogni id passato dovrebbe controllare se esiste il file nel server esterno tramite $urlimg

// e se esiste lo copia dentro $dir.$CodiceSpicers."_(npget).jpg"

public function SeEstImg($CodiceSpicers,$NomeBrand,$ListinoA,$DescrizioneBreve){
 
$urlimg2="http://xx/".$CodiceSpicers."A1.jpg";

$urlimg="http://xx/".$CodiceSpicers."A1.jpg";

$out='';
$urlfinal='';
$dir="../img1/";
$upast=$dir.$CodiceSpicers."_(npget).jpg";


if(is_file($urlimg2)){
 
 if (!copy($urlimg2,$dir.$CodiceSpicers."_(npget).jpg") ) {
   
	$out.="Copy NO success!Copy failed.";
       }else{
      $urlfinal=$dir.$CodiceSpicers."_(npget).jpg";
        $out.= "Copy success!";
        }
 
	 }else{
	 // senno mi stampa una img a caso 
      $urlfinal='../menuimg/jp.png';
        
   }
   
   $out.= "<div>"
   .$upast."<br>"
   .$urlimg2."<img src='$urlfinal' width='10%' >"
   .$urlfinal."<br>
<a href=''> ".iconv("windows-1252","UTF-8",$DescrizioneBreve)
."-".$NomeBrand."-".$ListinoA*2.30."</a><br>
</div>";
   //      print_r($rt);
   return $out;
   }
?>
