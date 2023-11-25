package tech.angelofdiasg.estruturas;

class TelefoneComparable implements Comparable<TelefoneComparable> {
    private String ddd;
    private String numero;

    public TelefoneComparable(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }

    @Override
    public int compareTo(TelefoneComparable outroTelefoneComparable) {
        // Compara��o lexicogr�fica dos n�meros de TelefoneComparable
        return this.numero.compareTo(outroTelefoneComparable.numero);
    }
}
