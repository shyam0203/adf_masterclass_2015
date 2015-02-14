package model;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 07 09:35:09 CET 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FiltersOnEmpViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Filter {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getFilter();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setFilter((String)value);
            }
        }
        ,
        WhereClause {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getWhereClause();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setWhereClause((String)value);
            }
        }
        ,
        BindParameter {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getBindParameter();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setBindParameter((String)value);
            }
        }
        ,
        FilterValue {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getFilterValue();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setFilterValue((String)value);
            }
        }
        ,
        RecordCount {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getRecordCount();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setRecordCount((Number)value);
            }
        }
        ,
        RownumberInFilter {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getRownumberInFilter();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setRownumberInFilter((Number)value);
            }
        }
        ,
        IsFirst {
            public Object get(FiltersOnEmpViewRowImpl obj) {
                return obj.getIsFirst();
            }

            public void put(FiltersOnEmpViewRowImpl obj, Object value) {
                obj.setIsFirst((Boolean)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(FiltersOnEmpViewRowImpl object);

        public abstract void put(FiltersOnEmpViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int FILTER = AttributesEnum.Filter.index();
    public static final int WHERECLAUSE = AttributesEnum.WhereClause.index();
    public static final int FILTERVALUE = AttributesEnum.FilterValue.index();
    public static final int RECORDCOUNT = AttributesEnum.RecordCount.index();
    public static final int ROWNUMBERINFILTER = AttributesEnum.RownumberInFilter.index();
    public static final int ISFIRST = AttributesEnum.IsFirst.index();

    public static final int BINDPARAMETER = AttributesEnum.BindParameter.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FiltersOnEmpViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Filter.
     * @return the Filter
     */
    public String getFilter() {
        return (String) getAttributeInternal(FILTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Filter.
     * @param value value to set the  Filter
     */
    public void setFilter(String value) {
        setAttributeInternal(FILTER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WhereClause.
     * @return the WhereClause
     */
    public String getWhereClause() {
        return (String) getAttributeInternal(WHERECLAUSE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WhereClause.
     * @param value value to set the  WhereClause
     */
    public void setWhereClause(String value) {
        setAttributeInternal(WHERECLAUSE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BindParameter.
     * @return the BindParameter
     */
    public String getBindParameter() {
        return (String) getAttributeInternal(BINDPARAMETER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BindParameter.
     * @param value value to set the  BindParameter
     */
    public void setBindParameter(String value) {
        setAttributeInternal(BINDPARAMETER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FilterValue.
     * @return the FilterValue
     */
    public String getFilterValue() {
        return (String) getAttributeInternal(FILTERVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FilterValue.
     * @param value value to set the  FilterValue
     */
    public void setFilterValue(String value) {
        setAttributeInternal(FILTERVALUE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RecordCount.
     * @return the RecordCount
     */
    public Number getRecordCount() {
        return (Number) getAttributeInternal(RECORDCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RecordCount.
     * @param value value to set the  RecordCount
     */
    public void setRecordCount(Number value) {
        setAttributeInternal(RECORDCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RownumberInFilter.
     * @return the RownumberInFilter
     */
    public Number getRownumberInFilter() {
        return (Number) getAttributeInternal(ROWNUMBERINFILTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RownumberInFilter.
     * @param value value to set the  RownumberInFilter
     */
    public void setRownumberInFilter(Number value) {
        setAttributeInternal(ROWNUMBERINFILTER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IsFirst.
     * @return the IsFirst
     */
    public Boolean getIsFirst() {
        return getRownumberInFilter().compareTo(1)==0;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsFirst.
     * @param value value to set the  IsFirst
     */
    public void setIsFirst(Boolean value) {
        setAttributeInternal(ISFIRST, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * Sample exportable method.
     */
    public void sampleFiltersOnEmpViewRowImplExportable() {
    }

    /**
     * Sample exportable method.
     */
    public void sampleFiltersOnEmpViewRowImplExportable2(String testParam1) {
    }
}
