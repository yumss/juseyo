/**
 * @file    UserSqlSessionMaster.java
 * @brief   Master DB사용시 필요한 메서드 구현 class 
 * @author  개발1팀
 * @author  성우현
 * @date    생성: 2014-03-14
 * @date    최종수정: 2014-03-14
 */
package com.juseyo.commons.lib.mybatis;

import org.apache.ibatis.session.SqlSession;

/**
 * @breif   Master DB사용시 필요한 메서드 구현 클래스 
 * @author  개발1팀/제비파트/성우현
 * @version 1.0.0
 * @date    생성: 2014-03-14
 * @date    수정: 2014-03-14
 * @remark
 */
public class UserSqlSessionMaster{
    private SqlSession sqlSession; 

    /**
     * @breif 생성자
     * @param sqlSession Master연결에 필요한 SqlSession 객체
     */
    public UserSqlSessionMaster(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
    
    public int insert(String statement) throws Exception {
        return sqlSession.insert(statement);
    }

    public int insert(String statement, Object parameter) throws Exception {
        return sqlSession.insert(statement, parameter);
    }

    public int update(String statement) throws Exception {
        return sqlSession.update(statement);
    }

    public int update(String statement, Object parameter) throws Exception {
        return sqlSession.update(statement, parameter);
    }

    public int delete(String statement) throws Exception {
        return sqlSession.delete(statement);
    }

    public int delete(String statement, Object parameter) throws Exception {
        return sqlSession.delete(statement, parameter);
    }
    
    

}
