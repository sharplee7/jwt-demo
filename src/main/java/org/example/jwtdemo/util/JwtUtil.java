package org.example.jwtdemo.util;

//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Member;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
//
//    public final static long TOKEN_VALIDATION_SECOND = 1000L * 10;
//    public final static long REFRESH_TOKEN_VALIDATION_SECOND = 1000L * 60 * 24 * 2;
//
//    final static public String ACCESS_TOKEN_NAME = "accessToken";
//    final static public String REFRESH_TOKEN_NAME = "refreshToken";
//
//    @Value("${jwt.secret}")
//    private String SECRET_KEY;
//
//    private Key getSigningKey(String secretKey) {
//        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
//        return Keys.hmacShaKeyFor(keyBytes);
//    }
//
//    /**
//     * extractAllclaims() : 토큰이 유효한 토큰인지 검사한 후, 토큰에 담긴 Payload 값을 가져온다.
//     */
//    public Claims extractAllClaims(String token) throws ExpiredJwtException {
//        return Jwts.parserBuilder()
//                .setSigningKey(getSigningKey(SECRET_KEY))
//                .build()
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//    /**
//     * getUsername() : 추출한 Payload로부터 userName을 가져온다.
//     * @param token
//     * @return
//     */
//    public String getUsername(String token) {
//        return extractAllClaims(token).get("username", String.class);
//    }
//
//    /**
//     * isTokenExpired() : 토큰이 만료됐는지 안됐는지 확인.
//     * @param token
//     * @return
//     */
//    public Boolean isTokenExpired(String token) {
//        final Date expiration = extractAllClaims(token).getExpiration();
//        return expiration.before(new Date());
//    }
//
//    /**
//     * 토큰 생성
//     * @param member
//     * @return
//     */
//    public String generateToken(Member member) {
//        return doGenerateToken(member.getUsername(), TOKEN_VALIDATION_SECOND);
//    }
//
//    /**
//     * 토큰 갱신
//     * @param member
//     * @return
//     */
//    public String generateRefreshToken(Member member) {
//        return doGenerateToken(member.getUsername(), REFRESH_TOKEN_VALIDATION_SECOND);
//    }
//
//    /**
//     * doGenerateToken() : 토큰을 생성, 페이로드에 담길 값은 username
//     */
//    public String doGenerateToken(String username, long expireTime) {
//
//        Claims claims = Jwts.claims();
//        claims.put("username", username);
//
//        String jwt = Jwts.builder()
//                .setClaims(claims)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
//                .signWith(getSigningKey(SECRET_KEY), SignatureAlgorithm.HS256)
//                .compact();
//
//        return jwt;
//    }
//
//    public Boolean validateToken(String token, UserDetails userDetails) {
//        final String username = getUsername(token);
//
//        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
//    }

}
