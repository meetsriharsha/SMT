package edu.umkc.sc9v9.tetris.tetris;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.sc9v9.tetris.IBoardPanel;
import edu.umkc.sc9v9.tetris.IClock;
import edu.umkc.sc9v9.tetris.ISidePanel;
import edu.umkc.sc9v9.tetris.ITetris;

public class TetrisArch extends AbstractMyxSimpleBrick implements ITetris
{
	public static final IMyxName msg_ITetris = MyxUtils.createName("edu.umkc.sc9v9.tetris.ITetris");
	public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.sc9v9.tetris.IClock");
    public static final IMyxName msg_ISidePanel = MyxUtils.createName("edu.umkc.sc9v9.tetris.ISidePanel");
    public static final IMyxName msg_IBoardPanel = MyxUtils.createName("edu.umkc.sc9v9.tetris.IBoardPanel");

    public ITetris OUT_ITetris;
    public IClock OUT_IClock;
    public ISidePanel OUT_ISidePanel;
    public IBoardPanel OUT_IBoardPanel;
    

	public ITetrisImp _imp;

    public TetrisArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected ITetrisImp getImplementation(){
        try{
			return new TetrisImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
    	/* OUT_ITetris = (ITetris) MyxUtils.getFirstRequiredServiceObject(this,msg_ITetris);
         if (OUT_ITetris == null){
  			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.ITetris returned null");
 			return;       
         }*/
        OUT_IClock = (IClock) MyxUtils.getFirstRequiredServiceObject(this,msg_IClock);
        if (OUT_IClock == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.IClock returned null");
			return;       
        }
        OUT_ISidePanel = (ISidePanel) MyxUtils.getFirstRequiredServiceObject(this,msg_ISidePanel);
        if (OUT_ISidePanel == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.ISidePanel returned null");
			return;       
        }
        OUT_IBoardPanel = (IBoardPanel) MyxUtils.getFirstRequiredServiceObject(this,msg_IBoardPanel);
        if (OUT_IBoardPanel == null){
 			System.err.println("Error: Interface edu.umkc.sc9v9.tetris.IBoardPanel returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		return null;
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		_imp.startGame();
		
	}

	@Override
	public void updateGame() {
		// TODO Auto-generated method stub
		_imp.updateGame();
	}

	@Override
	public void renderGame() {
		// TODO Auto-generated method stub
		_imp.renderGame();
	}

	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
		_imp.resetGame();
	}

	@Override
	public void spawnPiece() {
		// TODO Auto-generated method stub
		_imp.spawnPiece();
	}

	@Override
	public void rotatePiece(int newRotation) {
		// TODO Auto-generated method stub
		_imp.rotatePiece(newRotation);
	}
}