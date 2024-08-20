def normal_hour_salary(salary: Double, hour: Int):Double = {
    return salary*hour;
}

def OT_hour_salary(salary: Double , hour: Int): Double = {
    return salary*hour;
}

def tax_for_employee(normal_salary:Double , OT_salary:Double , normal_hour:Int , OT_hour:Int) : Double = {
    return {(normal_hour_salary(normal_salary,normal_hour) + OT_hour_salary(OT_salary,OT_hour))*0.1};
}

def pure_salary(normal_salary:Double , OT_salary:Double , normal_hour:Int , OT_hour:Int) : Double = {
    return normal_hour_salary(normal_salary,normal_hour) + OT_hour_salary(OT_salary,OT_hour) - tax_for_employee(normal_salary,OT_salary,normal_hour,OT_hour);
}

def main(args : Array[String]): Unit = {

    val normal_salary = 150;
    val OT_salary = 75;
    var normal_hour = 40;
    var OT_hour = 20;

    println(pure_salary(normal_salary,OT_salary,normal_hour,OT_hour));
}