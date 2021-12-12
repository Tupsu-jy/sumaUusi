package teht21;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ComputerFacade computer = new ComputerFacade();
		  computer.Start();
	}
}

/*
Facade: 

Muuta Javaksi ja täydennä Wikipediassa olevaa C++-ohjelman runkoa 
(https://en.wikipedia.org/wiki/Facade_pattern) tietokoneen 
”boottaus-simulaattorille”. Liitä ohjelmaan välivaiheiden tulostuksia. 

Ohjelman suorittaminen: tulosta muistiin ladatut datat (vaikkapa merkit, char) 1
"muistiosoite" kerrallaan. (Korvaa C++:n structit Javan luokilla ja lisää niihin 
tarvittavat muuttujat/tietorakenteet (harkitse taulukkorakenteita) .)

Lue: https://en.wikipedia.org/wiki/Boot_sector

struct CPU {
  void Freeze();
  void Jump(long position);
  void Execute();
  
  tää on tulostaja. sisältää memory
};

struct HardDrive {
  char* Read(long lba, int size);
  
  tänne taulukko jonka sisäl tosi pitkä string jossa ykkösiä ja nollia.
};

struct Memory {
  void Load(long position, char* data);
  
  taulukko jossa ykkösiä ja nollia
};

class ComputerFacade {
 public:
  void Start() {
    cpu_.Freeze();
    memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
    cpu_.Jump(kBootAddress);
    cpu_.Execute();
  }

 private:
  CPU cpu_;
  Memory memory_;
  HardDrive hard_drive_;
};

int main() {
  ComputerFacade computer;
  computer.Start();
}

*/