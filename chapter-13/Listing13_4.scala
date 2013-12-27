package bobsrockets {
  package navigation {
    class Navigator {
      val map = new StarMap
    }
    class StarMap
  }
  class Ship{
    val nav = new navigation.Navigator
  }
  package Fleets {
    class Fleet {
      def addShip() { new Ship }
    }
  }
}
