object Variables{
    def main(args: Array[String]): Unit = {
        var k,i,j=2;
        var m,n=5;
        var f=12.0f;
        var g=4.0f;
        var c='X';

        //a
        println(s"k+12*m = ${k+12*m}");
        //b
        println(s"m/j = ${m/j}");
        //c
        println(s"n%j = ${n%j}");
        //d
        println(s"m/j*j = ${m/j*j}");
        //e
        println(s"f+10*5+g = ${f+10*5+g}");
        //f
        i=i+1;
        println(s"++i*n = ${i*n}");
    }
}
