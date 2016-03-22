using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Battleship.Model;
using System.Windows.Data;
using System.ComponentModel;
using System.Windows.Input;
using System.Windows;

namespace Battleship.ViewModel
{
    class ComputerGridVM : GridVMBase
    {
        public ComputerGridVM(HumanPlayer humanPlayer, ComputerPlayer computerPlayer)
            : base(humanPlayer, computerPlayer)
        {
        }

        public override List<List<SeaSquare>> MyGrid
        {
            get
            {
                return _humanPlayer.EnemyGrid;
            }
        }

        //returns true if game is over
        public override bool Clicked(SeaSquare square, bool automated)
        {
            if (automated)
                _humanPlayer.ZmienTure(_computerPlayer);
            else
            {
                if (square.Type != TypPowierzchni.Unknown)
                {
                    MessageBox.Show("Please choose a new square");
                    return false;
                }

                _humanPlayer.ZmienTure(square.Rzad, square.Kolumna, _computerPlayer);
            }

            if (_computerPlayer.NoShipsSadFace() && _computerPlayer.NoVehiclesSadFace() && _computerPlayer.NoPlanesSadFace())
            {
                MessageBox.Show("You win!");
                return true;
            }
            else
            {
                _computerPlayer.ZmienGracza(_humanPlayer);
                if (_humanPlayer.NoShipsSadFace() && _humanPlayer.NoVehiclesSadFace() && _humanPlayer.NoPlanesSadFace())
                {
                    MessageBox.Show("You lose :(");
                    return true;
                }
            }

            return false;
        }
    }
}
