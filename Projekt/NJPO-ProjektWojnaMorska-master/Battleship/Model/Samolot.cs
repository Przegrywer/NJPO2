using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Battleship.Model
{
    internal enum typSamolotu
    {
        Samolot1,
        Samolot2,
        Samolot3
    };

    internal class Samolot
    {

        private int zdrowie;

        private readonly typSamolotu typ;

        private static readonly Dictionary<typSamolotu, int> dlugoscSamolotu =
            new Dictionary<typSamolotu, int>()
            {
                {typSamolotu.Samolot1, 4},
                {typSamolotu.Samolot2, 4},
                {typSamolotu.Samolot3, 4}
            };

        public Samolot(typSamolotu typ)
        {
            Reincarnate();
        }

        public void Reincarnate()
        {
            zdrowie = dlugoscSamolotu[typ];
        }

        public int Dlugosc
        {
            get { return dlugoscSamolotu[typ]; }
        }

        public bool czyZniszczony
        {
            get { return zdrowie == 0 ? true : false; }
        }

        public bool StrzelajW()
        {
            zdrowie--;
            return czyZniszczony;
        }

    }
}
