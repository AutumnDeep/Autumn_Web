import tw, { css, styled } from 'twin.macro';
import ProductList from './Web/ProductList';

const MyComponent = styled.div`
  ${tw`bg-blue-500 p-4 font-bold`} // 테일윈드 방법
  ${css`color: red;`} // css 방법 
`;

function App() {
  return (
    <div>
      <MyComponent > {/* 기존 방식도 가능*/}
        Styled with twin.macro and Emotion
      </MyComponent>
      <ProductList />
    </div>
  );
}

export default App;
