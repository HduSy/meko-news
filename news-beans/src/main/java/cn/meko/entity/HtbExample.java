package cn.meko.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HtbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HtbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHtbhIsNull() {
            addCriterion("htbh is null");
            return (Criteria) this;
        }

        public Criteria andHtbhIsNotNull() {
            addCriterion("htbh is not null");
            return (Criteria) this;
        }

        public Criteria andHtbhEqualTo(String value) {
            addCriterion("htbh =", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotEqualTo(String value) {
            addCriterion("htbh <>", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhGreaterThan(String value) {
            addCriterion("htbh >", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhGreaterThanOrEqualTo(String value) {
            addCriterion("htbh >=", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLessThan(String value) {
            addCriterion("htbh <", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLessThanOrEqualTo(String value) {
            addCriterion("htbh <=", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhLike(String value) {
            addCriterion("htbh like", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotLike(String value) {
            addCriterion("htbh not like", value, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhIn(List<String> values) {
            addCriterion("htbh in", values, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotIn(List<String> values) {
            addCriterion("htbh not in", values, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhBetween(String value1, String value2) {
            addCriterion("htbh between", value1, value2, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtbhNotBetween(String value1, String value2) {
            addCriterion("htbh not between", value1, value2, "htbh");
            return (Criteria) this;
        }

        public Criteria andHtlbIsNull() {
            addCriterion("htlb is null");
            return (Criteria) this;
        }

        public Criteria andHtlbIsNotNull() {
            addCriterion("htlb is not null");
            return (Criteria) this;
        }

        public Criteria andHtlbEqualTo(String value) {
            addCriterion("htlb =", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbNotEqualTo(String value) {
            addCriterion("htlb <>", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbGreaterThan(String value) {
            addCriterion("htlb >", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbGreaterThanOrEqualTo(String value) {
            addCriterion("htlb >=", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbLessThan(String value) {
            addCriterion("htlb <", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbLessThanOrEqualTo(String value) {
            addCriterion("htlb <=", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbLike(String value) {
            addCriterion("htlb like", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbNotLike(String value) {
            addCriterion("htlb not like", value, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbIn(List<String> values) {
            addCriterion("htlb in", values, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbNotIn(List<String> values) {
            addCriterion("htlb not in", values, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbBetween(String value1, String value2) {
            addCriterion("htlb between", value1, value2, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtlbNotBetween(String value1, String value2) {
            addCriterion("htlb not between", value1, value2, "htlb");
            return (Criteria) this;
        }

        public Criteria andHtmcIsNull() {
            addCriterion("htmc is null");
            return (Criteria) this;
        }

        public Criteria andHtmcIsNotNull() {
            addCriterion("htmc is not null");
            return (Criteria) this;
        }

        public Criteria andHtmcEqualTo(String value) {
            addCriterion("htmc =", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcNotEqualTo(String value) {
            addCriterion("htmc <>", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcGreaterThan(String value) {
            addCriterion("htmc >", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcGreaterThanOrEqualTo(String value) {
            addCriterion("htmc >=", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcLessThan(String value) {
            addCriterion("htmc <", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcLessThanOrEqualTo(String value) {
            addCriterion("htmc <=", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcLike(String value) {
            addCriterion("htmc like", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcNotLike(String value) {
            addCriterion("htmc not like", value, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcIn(List<String> values) {
            addCriterion("htmc in", values, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcNotIn(List<String> values) {
            addCriterion("htmc not in", values, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcBetween(String value1, String value2) {
            addCriterion("htmc between", value1, value2, "htmc");
            return (Criteria) this;
        }

        public Criteria andHtmcNotBetween(String value1, String value2) {
            addCriterion("htmc not between", value1, value2, "htmc");
            return (Criteria) this;
        }

        public Criteria andSbjyhIsNull() {
            addCriterion("sbjyh is null");
            return (Criteria) this;
        }

        public Criteria andSbjyhIsNotNull() {
            addCriterion("sbjyh is not null");
            return (Criteria) this;
        }

        public Criteria andSbjyhEqualTo(String value) {
            addCriterion("sbjyh =", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhNotEqualTo(String value) {
            addCriterion("sbjyh <>", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhGreaterThan(String value) {
            addCriterion("sbjyh >", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhGreaterThanOrEqualTo(String value) {
            addCriterion("sbjyh >=", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhLessThan(String value) {
            addCriterion("sbjyh <", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhLessThanOrEqualTo(String value) {
            addCriterion("sbjyh <=", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhLike(String value) {
            addCriterion("sbjyh like", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhNotLike(String value) {
            addCriterion("sbjyh not like", value, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhIn(List<String> values) {
            addCriterion("sbjyh in", values, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhNotIn(List<String> values) {
            addCriterion("sbjyh not in", values, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhBetween(String value1, String value2) {
            addCriterion("sbjyh between", value1, value2, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andSbjyhNotBetween(String value1, String value2) {
            addCriterion("sbjyh not between", value1, value2, "sbjyh");
            return (Criteria) this;
        }

        public Criteria andJfmcIsNull() {
            addCriterion("jfmc is null");
            return (Criteria) this;
        }

        public Criteria andJfmcIsNotNull() {
            addCriterion("jfmc is not null");
            return (Criteria) this;
        }

        public Criteria andJfmcEqualTo(String value) {
            addCriterion("jfmc =", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcNotEqualTo(String value) {
            addCriterion("jfmc <>", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcGreaterThan(String value) {
            addCriterion("jfmc >", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcGreaterThanOrEqualTo(String value) {
            addCriterion("jfmc >=", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcLessThan(String value) {
            addCriterion("jfmc <", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcLessThanOrEqualTo(String value) {
            addCriterion("jfmc <=", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcLike(String value) {
            addCriterion("jfmc like", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcNotLike(String value) {
            addCriterion("jfmc not like", value, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcIn(List<String> values) {
            addCriterion("jfmc in", values, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcNotIn(List<String> values) {
            addCriterion("jfmc not in", values, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcBetween(String value1, String value2) {
            addCriterion("jfmc between", value1, value2, "jfmc");
            return (Criteria) this;
        }

        public Criteria andJfmcNotBetween(String value1, String value2) {
            addCriterion("jfmc not between", value1, value2, "jfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcIsNull() {
            addCriterion("yfmc is null");
            return (Criteria) this;
        }

        public Criteria andYfmcIsNotNull() {
            addCriterion("yfmc is not null");
            return (Criteria) this;
        }

        public Criteria andYfmcEqualTo(String value) {
            addCriterion("yfmc =", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcNotEqualTo(String value) {
            addCriterion("yfmc <>", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcGreaterThan(String value) {
            addCriterion("yfmc >", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcGreaterThanOrEqualTo(String value) {
            addCriterion("yfmc >=", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcLessThan(String value) {
            addCriterion("yfmc <", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcLessThanOrEqualTo(String value) {
            addCriterion("yfmc <=", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcLike(String value) {
            addCriterion("yfmc like", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcNotLike(String value) {
            addCriterion("yfmc not like", value, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcIn(List<String> values) {
            addCriterion("yfmc in", values, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcNotIn(List<String> values) {
            addCriterion("yfmc not in", values, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcBetween(String value1, String value2) {
            addCriterion("yfmc between", value1, value2, "yfmc");
            return (Criteria) this;
        }

        public Criteria andYfmcNotBetween(String value1, String value2) {
            addCriterion("yfmc not between", value1, value2, "yfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcIsNull() {
            addCriterion("bfmc is null");
            return (Criteria) this;
        }

        public Criteria andBfmcIsNotNull() {
            addCriterion("bfmc is not null");
            return (Criteria) this;
        }

        public Criteria andBfmcEqualTo(String value) {
            addCriterion("bfmc =", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcNotEqualTo(String value) {
            addCriterion("bfmc <>", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcGreaterThan(String value) {
            addCriterion("bfmc >", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcGreaterThanOrEqualTo(String value) {
            addCriterion("bfmc >=", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcLessThan(String value) {
            addCriterion("bfmc <", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcLessThanOrEqualTo(String value) {
            addCriterion("bfmc <=", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcLike(String value) {
            addCriterion("bfmc like", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcNotLike(String value) {
            addCriterion("bfmc not like", value, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcIn(List<String> values) {
            addCriterion("bfmc in", values, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcNotIn(List<String> values) {
            addCriterion("bfmc not in", values, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcBetween(String value1, String value2) {
            addCriterion("bfmc between", value1, value2, "bfmc");
            return (Criteria) this;
        }

        public Criteria andBfmcNotBetween(String value1, String value2) {
            addCriterion("bfmc not between", value1, value2, "bfmc");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNull() {
            addCriterion("qdrq is null");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNotNull() {
            addCriterion("qdrq is not null");
            return (Criteria) this;
        }

        public Criteria andQdrqEqualTo(Date value) {
            addCriterionForJDBCDate("qdrq =", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("qdrq <>", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThan(Date value) {
            addCriterionForJDBCDate("qdrq >", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qdrq >=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThan(Date value) {
            addCriterionForJDBCDate("qdrq <", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("qdrq <=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqIn(List<Date> values) {
            addCriterionForJDBCDate("qdrq in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("qdrq not in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qdrq between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("qdrq not between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andHtqxIsNull() {
            addCriterion("htqx is null");
            return (Criteria) this;
        }

        public Criteria andHtqxIsNotNull() {
            addCriterion("htqx is not null");
            return (Criteria) this;
        }

        public Criteria andHtqxEqualTo(Integer value) {
            addCriterion("htqx =", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotEqualTo(Integer value) {
            addCriterion("htqx <>", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxGreaterThan(Integer value) {
            addCriterion("htqx >", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxGreaterThanOrEqualTo(Integer value) {
            addCriterion("htqx >=", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxLessThan(Integer value) {
            addCriterion("htqx <", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxLessThanOrEqualTo(Integer value) {
            addCriterion("htqx <=", value, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxIn(List<Integer> values) {
            addCriterion("htqx in", values, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotIn(List<Integer> values) {
            addCriterion("htqx not in", values, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxBetween(Integer value1, Integer value2) {
            addCriterion("htqx between", value1, value2, "htqx");
            return (Criteria) this;
        }

        public Criteria andHtqxNotBetween(Integer value1, Integer value2) {
            addCriterion("htqx not between", value1, value2, "htqx");
            return (Criteria) this;
        }

        public Criteria andFkfsIsNull() {
            addCriterion("fkfs is null");
            return (Criteria) this;
        }

        public Criteria andFkfsIsNotNull() {
            addCriterion("fkfs is not null");
            return (Criteria) this;
        }

        public Criteria andFkfsEqualTo(String value) {
            addCriterion("fkfs =", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsNotEqualTo(String value) {
            addCriterion("fkfs <>", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsGreaterThan(String value) {
            addCriterion("fkfs >", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsGreaterThanOrEqualTo(String value) {
            addCriterion("fkfs >=", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsLessThan(String value) {
            addCriterion("fkfs <", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsLessThanOrEqualTo(String value) {
            addCriterion("fkfs <=", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsLike(String value) {
            addCriterion("fkfs like", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsNotLike(String value) {
            addCriterion("fkfs not like", value, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsIn(List<String> values) {
            addCriterion("fkfs in", values, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsNotIn(List<String> values) {
            addCriterion("fkfs not in", values, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsBetween(String value1, String value2) {
            addCriterion("fkfs between", value1, value2, "fkfs");
            return (Criteria) this;
        }

        public Criteria andFkfsNotBetween(String value1, String value2) {
            addCriterion("fkfs not between", value1, value2, "fkfs");
            return (Criteria) this;
        }

        public Criteria andSbsysmIsNull() {
            addCriterion("sbsysm is null");
            return (Criteria) this;
        }

        public Criteria andSbsysmIsNotNull() {
            addCriterion("sbsysm is not null");
            return (Criteria) this;
        }

        public Criteria andSbsysmEqualTo(Integer value) {
            addCriterion("sbsysm =", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmNotEqualTo(Integer value) {
            addCriterion("sbsysm <>", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmGreaterThan(Integer value) {
            addCriterion("sbsysm >", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbsysm >=", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmLessThan(Integer value) {
            addCriterion("sbsysm <", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmLessThanOrEqualTo(Integer value) {
            addCriterion("sbsysm <=", value, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmIn(List<Integer> values) {
            addCriterion("sbsysm in", values, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmNotIn(List<Integer> values) {
            addCriterion("sbsysm not in", values, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmBetween(Integer value1, Integer value2) {
            addCriterion("sbsysm between", value1, value2, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbsysmNotBetween(Integer value1, Integer value2) {
            addCriterion("sbsysm not between", value1, value2, "sbsysm");
            return (Criteria) this;
        }

        public Criteria andSbzbkIsNull() {
            addCriterion("sbzbk is null");
            return (Criteria) this;
        }

        public Criteria andSbzbkIsNotNull() {
            addCriterion("sbzbk is not null");
            return (Criteria) this;
        }

        public Criteria andSbzbkEqualTo(Double value) {
            addCriterion("sbzbk =", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkNotEqualTo(Double value) {
            addCriterion("sbzbk <>", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkGreaterThan(Double value) {
            addCriterion("sbzbk >", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkGreaterThanOrEqualTo(Double value) {
            addCriterion("sbzbk >=", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkLessThan(Double value) {
            addCriterion("sbzbk <", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkLessThanOrEqualTo(Double value) {
            addCriterion("sbzbk <=", value, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkIn(List<Double> values) {
            addCriterion("sbzbk in", values, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkNotIn(List<Double> values) {
            addCriterion("sbzbk not in", values, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkBetween(Double value1, Double value2) {
            addCriterion("sbzbk between", value1, value2, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbkNotBetween(Double value1, Double value2) {
            addCriterion("sbzbk not between", value1, value2, "sbzbk");
            return (Criteria) this;
        }

        public Criteria andSbzbqIsNull() {
            addCriterion("sbzbq is null");
            return (Criteria) this;
        }

        public Criteria andSbzbqIsNotNull() {
            addCriterion("sbzbq is not null");
            return (Criteria) this;
        }

        public Criteria andSbzbqEqualTo(Integer value) {
            addCriterion("sbzbq =", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqNotEqualTo(Integer value) {
            addCriterion("sbzbq <>", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqGreaterThan(Integer value) {
            addCriterion("sbzbq >", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbzbq >=", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqLessThan(Integer value) {
            addCriterion("sbzbq <", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqLessThanOrEqualTo(Integer value) {
            addCriterion("sbzbq <=", value, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqIn(List<Integer> values) {
            addCriterion("sbzbq in", values, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqNotIn(List<Integer> values) {
            addCriterion("sbzbq not in", values, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqBetween(Integer value1, Integer value2) {
            addCriterion("sbzbq between", value1, value2, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andSbzbqNotBetween(Integer value1, Integer value2) {
            addCriterion("sbzbq not between", value1, value2, "sbzbq");
            return (Criteria) this;
        }

        public Criteria andQttkIsNull() {
            addCriterion("qttk is null");
            return (Criteria) this;
        }

        public Criteria andQttkIsNotNull() {
            addCriterion("qttk is not null");
            return (Criteria) this;
        }

        public Criteria andQttkEqualTo(String value) {
            addCriterion("qttk =", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkNotEqualTo(String value) {
            addCriterion("qttk <>", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkGreaterThan(String value) {
            addCriterion("qttk >", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkGreaterThanOrEqualTo(String value) {
            addCriterion("qttk >=", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkLessThan(String value) {
            addCriterion("qttk <", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkLessThanOrEqualTo(String value) {
            addCriterion("qttk <=", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkLike(String value) {
            addCriterion("qttk like", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkNotLike(String value) {
            addCriterion("qttk not like", value, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkIn(List<String> values) {
            addCriterion("qttk in", values, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkNotIn(List<String> values) {
            addCriterion("qttk not in", values, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkBetween(String value1, String value2) {
            addCriterion("qttk between", value1, value2, "qttk");
            return (Criteria) this;
        }

        public Criteria andQttkNotBetween(String value1, String value2) {
            addCriterion("qttk not between", value1, value2, "qttk");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}