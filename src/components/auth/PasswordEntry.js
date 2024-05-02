import React, { useState } from 'react';
import styled from 'styled-components';
import { useNavigate } from 'react-router-dom';

const Container = styled.div`
  width: 100%;
  max-width: 360px;
  margin: 40px auto;
  padding: 20px;
  background-color: rgba(255, 255, 255, 0.3);
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  position: relative;
  z-index: 1020;
`;

const CloseButton = styled.button`
  position: absolute;
  top: 10px;
  right: 10px;
  background: none;
  border: none;
  font-size: 24px;
  cursor: pointer;
  color: #333;
`;

const Title = styled.h1`
  font-size: 24px;
  color: #333;
  text-align: center;
  margin-bottom: 20px;
`;

const Form = styled.form`
  display: flex;
  flex-direction: column;
  gap: 20px;
  width: 100%;
`;

const Input = styled.input`
  width: 94%;
  padding: 10px;
  margin-top: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
  background-color: #f8f8f8;
`;

const Button = styled.button`
  padding: 10px 20px;
  color: white;
  background-color: rgba(192, 192, 192);
  border: none;
  border-radius: 4px;
  cursor: pointer;
  &:hover {
    background-color: rgba(160, 160, 160);
  }
`;

const PasswordEntry = () => {
  const navigate = useNavigate();
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (password === '1234') {
      navigate('/userinfo');
    } else {
      alert('Incorrect password');
    }
  };

  const handleClose = () => {
    navigate('/');
  };

  return (
    <Container>
      <CloseButton onClick={handleClose}>&times;</CloseButton>
      <Title>Enter Password</Title>
      <Form onSubmit={handleSubmit}>
        <Input
          type="password"
          placeholder="Enter your password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <Button type="submit">Submit</Button>
      </Form>
    </Container>
  );
};

export default PasswordEntry;
