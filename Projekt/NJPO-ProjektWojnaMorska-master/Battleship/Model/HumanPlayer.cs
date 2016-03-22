using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Battleship.Model
{
    class HumanPlayer: Player
    {
        public void ZmienTure(int row, int col, Player otherPlayer)
        {
            Strzelaj(row, col, otherPlayer);
        }
    }
}
