/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoarg;

/**
 *
 * @author philip
 */
public class CuentaCorriente extends Cuenta
{

    private boolean mDesc;

    public CuentaCorriente(int pNro, double pSaldo, boolean pDesc)
    {
        super(pNro, pSaldo);
        mDesc = pDesc;
    }

    public boolean isDesc()
    {
        return mDesc;
    }

    public void setDesc(boolean mDesc)
    {
        this.mDesc = mDesc;
    }

    public boolean retirar(double pMonto)
    {
        boolean wRes = false;
        //Es Cuenta Corriente evaluar descubierto...
        if (mDesc || pMonto <= mSaldo)
        {
            mSaldo -= pMonto;
            wRes = true;
        }
        

        return wRes;
    }

    public String toString()
    {
        StringBuffer wRes = new StringBuffer();

        wRes.append(super.toString());
        wRes.append("\n\tTipo:\tCorriente");
        wRes.append("\n\tDescubierto:\t");
        if (mDesc)
        {
            wRes.append("Si");
        } else
        {
            wRes.append("No");
        }

        return wRes.toString();

    }

    public boolean pertenece(String pToken)
    {
        boolean wRes = false;
        if (pToken.equalsIgnoreCase("corriente"))
        {
            wRes = true;
        }
        return wRes;
    }
}
