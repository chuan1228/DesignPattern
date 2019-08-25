package com.chuan_sir.proxypattern.staticProxy;

/**
 * author : dongxiaochuan
 * date : 2019-08-14 15:52
 * description :
 */
public class Lawer implements ILawsuit {

    private ILawsuit iLawsuit;

    public Lawer(ILawsuit iLawsuit) {
        this.iLawsuit = iLawsuit;
    }

    @Override
    public void submit() {
        iLawsuit.submit();
    }

    @Override
    public void burde() {
        iLawsuit.burde();
    }

    @Override
    public void defend() {
        iLawsuit.defend();
    }

    @Override
    public void finish() {
        iLawsuit.finish();
    }
}
