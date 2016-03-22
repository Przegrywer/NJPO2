using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;

namespace Battleship.Model
{
    enum TypPowierzchni { Unknown, Water, Undamaged, Damaged, Destroyed, Grass, GrassHit, WaterHit }

    enum ObiektNaPlanszy { Unknown, Ship, Vehicle, Plane, Destroyed }

    class SeaSquare : DependencyObject
    {
        public int Rzad { get; private set;  }
        public int Kolumna { get; private set; }
        public int SquareIndex { get; set; }


        public TypPowierzchni Type
        {
            get { return (TypPowierzchni)GetValue(TypeProperty); }
            set { SetValue(TypeProperty, value); }
        }
        public static readonly DependencyProperty TypeProperty =
        DependencyProperty.Register("Type", typeof(TypPowierzchni), typeof(SeaSquare), null);



        public ObiektNaPlanszy ObjectType
        {
            get { return (ObiektNaPlanszy)GetValue(ObjectProperty); }
            set { SetValue(ObjectProperty, value); }
        }
        public static readonly DependencyProperty ObjectProperty =
       DependencyProperty.Register("ObjectType", typeof(ObiektNaPlanszy), typeof(SeaSquare), null);


        public SeaSquare(int rzad, int kolumna)
        {
            Rzad = rzad;
            Kolumna = kolumna;
        }

        public void Reset(TypPowierzchni type, ObiektNaPlanszy objectType)
        {
            ObjectType = objectType;
            Type = type;
            SquareIndex = -1;
        }

    }
}
