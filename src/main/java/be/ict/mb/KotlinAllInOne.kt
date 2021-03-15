package be.ict.mb

class KotlinAllInOne : CanPrint by p, CanScan by s {
}

val p = Printer()
val s = Scanner()
