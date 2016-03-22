using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Data;
using Battleship.Model;
using System.Windows.Media;
using System.Globalization;

namespace Battleship.View
{
    [ValueConversion(typeof(TypPowierzchni), typeof(Brush))]
    public class ColorConverter : IValueConverter
    {
        public object Convert(object value, Type targetType,
            object parameter, CultureInfo culture)
        {
            TypPowierzchni type = (TypPowierzchni)value;

            switch (type)
            {
                case TypPowierzchni.Unknown:
                    return new SolidColorBrush(Colors.LightGray);
                case TypPowierzchni.Water:
                    return new SolidColorBrush(Colors.LightBlue);
                case TypPowierzchni.WaterHit:
                    return new SolidColorBrush(Colors.Blue);
                case TypPowierzchni.Grass:
                    return new SolidColorBrush(Colors.LightGreen);
                case TypPowierzchni.GrassHit:
                    return new SolidColorBrush(Colors.Green);
                case TypPowierzchni.Undamaged:
                    return new SolidColorBrush(Colors.Black);
                case TypPowierzchni.Damaged:
                    return new SolidColorBrush(Colors.Orange);
                case TypPowierzchni.Destroyed:
                    return new SolidColorBrush(Colors.Red);
            }

            throw new Exception("fail");
        }

        public object ConvertBack(object value, Type targetType,
            object parameter, CultureInfo culture)
        {
            return null;
        }
    }
}
